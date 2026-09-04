# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# minifyEnabled is currently false for the release build type, so these
# rules are not exercised yet. Kept here (and referenced from build.gradle)
# so the release build config is valid and ready if/when minification is
# enabled in the future.

# Keep Gson model classes that are (de)serialized via reflection if you add
# any typed request/response DTOs later.
# -keep class com.MuslimMedia.ans.model.** { *; }
