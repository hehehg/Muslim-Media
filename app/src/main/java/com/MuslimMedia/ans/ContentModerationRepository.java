package com.MuslimMedia.ans;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

final class ContentModerationRepository {
	interface Callback {
		void onResult(String status, String requestId);
		void onError(String message);
	}

	private ContentModerationRepository() { }

	static void submit(android.content.Context context, String content, String type,
			String gender, Callback callback) {
		if (FirebaseApp.getApps(context).isEmpty()) {
			callback.onError("لم يتم إعداد Firebase بعد. أضف google-services.json للمشروع.");
			return;
		}
		FirebaseAuth auth = FirebaseAuth.getInstance();
		Runnable submitRequest = () -> {
			Map<String, Object> request = new HashMap<>();
			request.put("content", content);
			request.put("type", type);
			request.put("audienceGender", gender);
			request.put("status", "pending");
			request.put("userId", auth.getCurrentUser().getUid());
			request.put("createdAt", FieldValue.serverTimestamp());
			FirebaseFirestore.getInstance().collection("moderation_requests")
					.add(request)
					.addOnSuccessListener(document -> watch(document.getId(), callback))
					.addOnFailureListener(error -> callback.onError("تعذر إرسال المحتوى للمراجعة."));
		};
		if (auth.getCurrentUser() != null) {
			submitRequest.run();
		} else {
			auth.signInAnonymously()
					.addOnSuccessListener(result -> submitRequest.run())
					.addOnFailureListener(error -> callback.onError("تعذر تفعيل جلسة المستخدم."));
		}
	}

	private static void watch(String requestId, Callback callback) {
		FirebaseFirestore.getInstance().collection("moderation_requests").document(requestId)
				.addSnapshotListener((snapshot, error) -> {
					if (error != null) {
						callback.onError("تعذر متابعة حالة المراجعة.");
						return;
					}
					if (snapshot == null || !snapshot.exists()) return;
					String status = snapshot.getString("status");
					if (status == null) status = "pending";
					String audienceGender = snapshot.getString("audienceGender");
					if ("approved".equals(status) && audienceGender != null
							&& !"all".equals(audienceGender)) {
						status = "approved_" + audienceGender;
					}
					callback.onResult(status, requestId);
				});
	}
}