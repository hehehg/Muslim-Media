# وسائل تواصل المسلم (Muslim Media)

تطبيق أندرويد (Java) يوفر واجهة "إسلامية" لتصفح مواقع التواصل الاجتماعي (يوتيوب، فيسبوك، إنستغرام، تويتر/X، واتساب ويب، تيليجرام ويب) داخل WebViews مع فلترة كلمات محظورة، بالإضافة إلى سبحة إلكترونية (تسبيح) بدون إنترنت.

> تم تحويل هذا المشروع من تصدير Sketchware إلى مشروع Gradle قياسي قابل للفتح مباشرة في Android Studio، بدون أي أدوات أو قوالب خاصة بـ Sketchware.

## البنية

```
.
├── app/
│   ├── src/main/java/com/MuslimMedia/ans/   # الكود المصدري
│   ├── src/main/res/                        # الموارد (layouts, drawables, values)
│   ├── src/main/assets/fonts/               # خطوط Amiri وDigital
│   └── build.gradle
├── build.gradle
├── settings.gradle
├── gradle/wrapper/                          # Gradle Wrapper (8.6)
└── .github/workflows/build.yml              # بناء تلقائي عبر GitHub Actions
```

## المتطلبات

- Android Studio (Koala أو أحدث يُفضّل)
- JDK 17
- Android SDK: `compileSdk 34`, `minSdk 21`, `targetSdk 28` (راجع ملاحظة targetSdk أدناه)

## البناء محليًا

```bash
git clone <repo-url>
cd MuslimMedia
./gradlew assembleDebug
```

سيُنتج APK في `app/build/outputs/apk/debug/`.

## التحقق من الأسرار (Secrets) قبل جعل المستودع Public

تم فحص كامل الكود بحثًا عن مفاتيح API، توكنات، أو ملفات إعداد حساسة (مثل `google-services.json`):

- **لم يتم العثور على أي مفتاح API أو توكن أو كلمة مرور مُضمّنة في الكود.**
- لا يوجد ملف `google-services.json` أو أي إعداد Firebase فعلي في المشروع (كان هناك classpath قديم غير مُستخدَم لـ Firebase في `build.gradle` الأصلي، تمت إزالته لأنه غير مُطبَّق أصلًا).
- كل الروابط الموجودة في الكود هي روابط عامة (يوتيوب، فيسبوك، صفحات هبوط للمطوّر… إلخ) وليست بيانات حساسة.

➡️ **يمكنك جعل المستودع Public بأمان من ناحية الأسرار.** فقط تذكّر مستقبلًا: أي مفتاح توقيع (`keystore`/`*.jks`) أو `keystore.properties` **يجب ألا يُرفع أبدًا** — تم إضافتهما إلى `.gitignore` احتياطًا.

## أهم الإصلاحات التي تمت في هذا التحويل

### أمان
- **إزالة تعطيل التحقق من شهادات SSL** في `RequestNetworkController.java` (كان يثق بأي شهادة ولأي نطاق — ثغرة Man-in-the-Middle كلاسيكية من قوالب Sketchware). الآن يستخدم إعدادات OkHttp الآمنة الافتراضية.
- حصر صلاحيات التخزين بـ `maxSdkVersion` مناسب بدلًا من طلبها دون قيد على كل الإصدارات.

### استقرار (كراشات)
- إصلاح أكثر من 18 موضعًا في `SocialMediaActivity.java` كانت تستدعي `Double.parseDouble(prefs.getString(key, ""))` — عند أول تشغيل للتطبيق تكون هذه القيم غير موجودة في `SharedPreferences`، فتُعيد سلسلة فارغة ويحدث `NumberFormatException` (كراش شبه مؤكد لأي مستخدم جديد في تدفقات مُعيّنة). تم تغيير القيمة الافتراضية إلى `"0"`.
- إصلاح احتمال `NullPointerException` في `OfflineSbhaActivity` بسبب مشاركة متغيّر `Timer` واحد بين ميزتي "العدّ التلقائي" و"أنيميشن الضغط على الزر" — تم فصلهما إلى متغيّرين منفصلين مع فحص `null`.

### تنظيف المشروع / البناء
- إزالة نشاط `.DebugActivity` من `AndroidManifest.xml` (كان مذكورًا في المانفست بدون أي كلاس مطابق في الكود — من مخلّفات Sketchware، ويمكن أن يسبب فشل linting/الإصدار).
- إزالة الصلاحيات المكرّرة في المانفست (`INTERNET`, `READ/WRITE_EXTERNAL_STORAGE` كانت مكررة).
- إضافة `app/proguard-rules.pro` المفقود رغم أن `build.gradle` كان يشير إليه.
- استبدال `jcenter()` (متوقف تمامًا منذ 2022) بـ `mavenCentral()` في كل من `build.gradle` الجذري.
- إزالة classpath غير مُستخدَم لـ `google-services` (Firebase) لأنه لم يكن مُطبّقًا أصلًا في وحدة `app`.
- إضافة `namespace` في `app/build.gradle` (إلزامي في Android Gradle Plugin 8+).
- ترقية Android Gradle Plugin إلى `8.3.2` وGradle إلى `8.6`، مع إضافة Gradle Wrapper كاملًا (`gradlew`, `gradlew.bat`, `gradle-wrapper.jar/properties`) — لم يكن موجودًا في التصدير الأصلي، وهو ضروري للبناء عبر CI أو من أي جهاز بدون تثبيت Gradle يدويًا.
- ترقية بعض التبعيات لإصدارات أحدث ومدعومة أمنيًا (`appcompat 1.6.1`, `material 1.11.0`, `gson 2.10.1`, `okhttp 3.12.13`) مع الحفاظ على نفس الـ API المستخدَم (لا تغييرات على السلوك).
- إضافة `.gitignore` قياسي لمشاريع أندرويد و`gradle.properties`.
- إضافة `.github/workflows/build.yml` لبناء APK (debug + release غير موقّع) تلقائيًا عند كل push/PR، مع رفعه كـ Artifact قابل للتحميل من صفحة الـ Actions.

### قرار مقصود: targetSdkVersion لم يتم رفعه
التطبيق يعتمد على `android:requestLegacyExternalStorage="true"` للوصول المباشر للملفات، وهذا الإعداد **يتوقف عن العمل تلقائيًا بعد `targetSdkVersion 29`** (يفرض أندرويد التخزين المُقيّد Scoped Storage). رفع `targetSdk` بدون تعديل كود الوصول للملفات (`FileUtil.java` وأجزاء من `SocialMediaActivity`) كان سيكسر قراءة/كتابة الملفات بصمت على أندرويد 10+. لذلك تم الإبقاء على `targetSdkVersion 28` مؤقتًا مع رفع `compileSdk` إلى 34 فقط (لأدوات البناء الحديثة). هذه نقطة يُنصح بمعالجتها لاحقًا (الانتقال إلى Scoped Storage / MediaStore) قبل النشر على متجر Google Play، الذي يفرض حاليًا `targetSdk 34+` للتطبيقات الجديدة.

## إصلاحات إضافية (الجولة الثانية)

- **حماية من Path Traversal في جسر JavaScript**: `webview1` هو متصفح داخلي عام (يتصفح أي موقع ينتقل إليه المستخدم من نتائج البحث، وليس مقيّدًا بـ google.com فقط — لذلك تقييد الجسر بنطاق واحد كان سيكسر ميزة حفظ الملفات من أي موقع، فتم استبعاد هذا الخيار). المشكلة الفعلية كانت أن `fileName` القادم من جافاسكريبت الصفحة يُستخدَم مباشرة لبناء مسار الملف داخل `Environment.getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS)` دون أي تعقيم — فموقع خبيث كان يستطيع تمرير اسم ملف يحتوي على `../../` للكتابة خارج مجلد التنزيلات. تم إصلاحه بأخذ اسم الملف فقط عبر `new File(fileName).getName()` قبل الاستخدام.
- **تطبيع الأرقام العربية-الهندية قبل التحويل الرقمي**: أضفت `SketchwareUtil.normalizeArabicIndicDigits(...)` و`SketchwareUtil.parseDoubleSafe(...)` (تُطبّع الأرقام ثم تُحوّل بأمان مع قيمة افتراضية بدل رمي استثناء)، واستخدمتها في حقل "عدد الجلسات" (`edittext2`) الذي كان يستدعي `Double.parseDouble` مباشرة على نص المستخدم قبل أي تطبيع للأرقام العربية-الهندية (٠١٢٣...)، ما كان يسبب كراشًا لو كتب المستخدم بلوحة مفاتيح عربية. هذه الدوال المساعدة جاهزة أيضًا لإعادة استخدامها في أي موضع مشابه مستقبلًا.

## ملاحظات وتوصيات لتطوير لاحق (لم يتم تعديلها بعد)

## حماية المحتوى داخل المتصفح

تمت إضافة طبقة خفيفة مستوحاة من فكرة Tahir داخل جميع WebViews في التطبيق:

- تشويش الصور والإطارات، مع خيار مستقل لتشويش الفيديوهات.
- التحكم في درجة التشويش من إعدادات التطبيق أسفل إعدادات المؤقتات.
- حفظ الإعدادات محليًا وتطبيقها تلقائيًا عند تحميل الصفحات أو تغيير الإعداد.
- النقر على صورة أو فيديو أو إطار يكشفه مؤقتًا لمدة خمس ثوانٍ.

هذه الطبقة لا تستخدم نموذج ذكاء اصطناعي ولا تدّعي تحديد جنس الأشخاص؛ لذلك فهي مناسبة أكثر للأجهزة الضعيفة وتعمل دون خادم. تصنيف الرجال والنساء يحتاج نموذج رؤية حاسوبية منفصلًا، وقد لا يعمل داخل كل مواقع التواصل بسبب قيود WebView وسياسات المواقع.

1. ملف `SocialMediaActivity.java` ضخم جدًا (~3750 سطرًا) ويحتوي منطقًا متكررًا كثيرًا (كل WebView له نسخة شبه مطابقة من معالجات نفس الأحداث). يُنصح بشدة بإعادة الهيكلة لاحقًا إلى دوال/كلاسات مشتركة لتسهيل الصيانة — لم يتم فعل ذلك هنا تفاديًا لتغيير سلوك موجود بدون اختبار فعلي على جهاز/محاكي.
2. لا توجد اختبارات آلية (unit/instrumented tests) في المشروع حاليًا.
3. الانتقال إلى Scoped Storage / MediaStore بدلًا من `requestLegacyExternalStorage` (مطلوب قبل رفع `targetSdkVersion` فوق 29، ومطلوب أصلًا لأي نشر جديد على Google Play الذي يفرض `targetSdk 34+`).


## رفع المشروع إلى GitHub

لم أقم برفع المشروع نيابة عنك (لا أملك بيانات اعتماد GitHub الخاصة بك). الخطوات:

```bash
cd MuslimMedia
git init
git add .
git commit -m "Convert Sketchware export to a clean Gradle project"
git branch -M main
git remote add origin https://github.com/hehehg/<repo>.git
git push -u origin main
```

بعد الرفع، ستجد بناء APK تلقائي في تبويب **Actions** بفضل `.github/workflows/build.yml`.
