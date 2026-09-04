package com.MuslimMedia.ans;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {

	private Timer _timer = new Timer();

	private LinearLayout linear1;
	private LinearLayout linear2;
	private ProgressBar progressbar1;
	private TextView textview2;
	private TextView textview1;

	private TimerTask t;
	private Intent i = new Intent();
	private SharedPreferences sav_mode;
	private SharedPreferences userProfile;

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}

	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		progressbar1 = findViewById(R.id.progressbar1);
		textview2 = findViewById(R.id.textview2);
		textview1 = findViewById(R.id.textview1);
		sav_mode = getSharedPreferences("svamode", Activity.MODE_PRIVATE);
		userProfile = getSharedPreferences("user_profile", Activity.MODE_PRIVATE);
	}

	private void initializeLogic() {
		if (!sav_mode.getString("mode", "").equals("")) {
			if (sav_mode.getString("mode", "").equals("day")) {
				_style_day();
			}
			else {
				_style();
			}
		}
		else {
			sav_mode.edit().putString("mode", "night").commit();
			_style();
		}
		if (userProfile.getString("gender", "").isEmpty()) {
			showGenderDialog();
		} else {
			scheduleSocialMediaActivity();
		}
	}

	private void scheduleSocialMediaActivity() {
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						i.setClass(getApplicationContext(), SocialMediaActivity.class);
						startActivity(i);
						finish();
					}
				});
			}
		};
		_timer.schedule(t, 1000);
	}

	private void showGenderDialog() {
		final boolean nightMode = "night".equals(sav_mode.getString("mode", "night"));
		final int textColor = nightMode ? Color.WHITE : Color.rgb(33, 33, 33);
		final LinearLayout choices = new LinearLayout(this);
		choices.setOrientation(LinearLayout.VERTICAL);
		choices.setPadding(24, 8, 24, 8);
		RadioGroup genderGroup = new RadioGroup(this);
		RadioButton male = createGenderChoice("ذكر", textColor);
		RadioButton female = createGenderChoice("أنثى", textColor);
		genderGroup.addView(male);
		genderGroup.addView(female);
		choices.addView(genderGroup);
		final int dialogTheme = nightMode ? AlertDialog.THEME_DEVICE_DEFAULT_DARK
				: AlertDialog.THEME_DEVICE_DEFAULT_LIGHT;
		AlertDialog dialog = new AlertDialog.Builder(this, dialogTheme)
				.setTitle("اختر جنسك")
				.setMessage("سيُستخدم الاختيار لعرض المحتوى المناسب لك فقط")
				.setView(choices)
				.setPositiveButton("متابعة", null)
				.setCancelable(false)
				.create();
		dialog.setOnShowListener(unused -> {
			Button positive = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
			positive.setEnabled(false);
			genderGroup.setOnCheckedChangeListener((group, checkedId) -> {
				userProfile.edit().putString("gender", checkedId == male.getId() ? "male" : "female").apply();
				positive.setEnabled(true);
			});
			positive.setOnClickListener(view -> {
				dialog.dismiss();
				scheduleSocialMediaActivity();
			});
		});
		dialog.show();
	}

	private RadioButton createGenderChoice(String text, int textColor) {
		RadioButton choice = new RadioButton(this);
		choice.setId(View.generateViewId());
		choice.setText(text);
		choice.setTextColor(textColor);
		choice.setTextSize(18);
		choice.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
		choice.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
		choice.setPadding(8, 12, 8, 12);
		return choice;
	}

	@Override
	protected void onDestroy() {
		if (t != null) {
			t.cancel();
		}
		if (_timer != null) {
			_timer.cancel();
		}
		super.onDestroy();
	}

	public void _style() {
		linear1.setBackgroundColor(0xFF000000);
		textview1.setBackgroundResource(R.drawable.btn_ripple);
		textview2.setBackgroundResource(R.drawable.btn_ripple);
		textview1.setTextColor(0xFFFFFFFF);
		textview2.setTextColor(0xFFFFFFFF);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
	}


	public void _style_day() {
		linear1.setBackgroundColor(0xFFFFFFFF);
		textview1.setBackgroundResource(R.drawable.btn_ripple_day);
		textview2.setBackgroundResource(R.drawable.btn_ripple_day);

		// النصوص النهارية (غامق)
		int dayText = 0xFF212121;
		textview1.setTextColor(dayText);
		textview2.setTextColor(dayText);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
	}


	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}

	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}

	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}

	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}

	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}

	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}

	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
