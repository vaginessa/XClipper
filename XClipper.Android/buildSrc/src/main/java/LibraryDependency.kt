private object LibraryVersion {
    const val CORE_KTX = "1.3.0"
    const val APP_COMPAT = "1.2.0"
    const val COLLECTIONS_KTX = "1.1.0"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val MATERIAL = "1.2.0-beta01"
    const val PLAY_CORE = "1.8.2"
    const val PLAY_CORE_KTX = "1.8.1"
    const val GSON = "2.8.6"
    const val ROOM = "2.2.5"
    const val PAGING = "2.1.2"
    const val LIFECYCLE = "2.2.0"
    const val KODEIN = "6.2.1"
    const val RETROFIT = "2.9.0"
    const val OKHTTP = "4.7.2"
    const val GSON_CONVERTER = "2.7.0"
    const val COROUTINES_ADAPTER = "0.9.2"
    const val SIMPLE_SEARCH_VIEW = "0.1.5"
    const val PREFERENCES = "1.1.1"
    const val FLEXBOX = "2.0.1"
    const val LOTTIE = "3.4.0"
    const val ZXING_QR = "4.1.0"
    const val TOASTY = "1.4.2"
    const val ROUND_BOTTOM_SHEET = "1.0.1"
    const val FLOATING_BUBBLE = "3.0.0"
    const val GIF_DRAWABLE = "1.2.19"
    const val REALTIME_DATABASE = "19.3.1"
    const val FIREBASE_AUTH = "19.3.2"
    const val PLAY_SERVICE_AUTH = "18.0.0"
    const val ACTIVITY = "1.2.0-alpha06"
    const val FRAGMENT = "1.2.5"
    const val WORK_MANAGER = "2.4.0"
    const val HVLOG = "0.1-alpha03"
    const val COIL = "1.0.0-rc3"
    const val GLIDE = "4.11.0"
    const val RECYCLERVIEW = "1.1.0"
    const val CWT = "0.1.3"
    const val HILT_COMPILER = "1.0.0-alpha01"
}

object LibraryDependency {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersion.KOTLIN}"
    const val CORE_KTX = "androidx.core:core-ktx:${LibraryVersion.CORE_KTX}"
    const val COLLECTIONS_KTX = "androidx.collection:collection-ktx:${LibraryVersion.COLLECTIONS_KTX}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${LibraryVersion.APP_COMPAT}"
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${LibraryVersion.ACTIVITY}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${LibraryVersion.FRAGMENT}"
    const val WORK_MANAGER = "androidx.work:work-runtime-ktx:${LibraryVersion.WORK_MANAGER}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${LibraryVersion.CONSTRAINT_LAYOUT}"
    const val MATERIAL = "com.google.android.material:material:${LibraryVersion.MATERIAL}"
    const val PLAY_CORE = "com.google.android.play:core:${LibraryVersion.PLAY_CORE}"
    const val PLAY_CORE_KTX = "com.google.android.play:core:${LibraryVersion.PLAY_CORE_KTX}"
    const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${CoreVersion.ANDROID_COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${CoreVersion.ANDROID_COROUTINES}"
    const val GSON = "com.google.code.gson:gson:${LibraryVersion.GSON}"
    const val ROOM_KTX = "androidx.room:room-ktx:${LibraryVersion.ROOM}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${LibraryVersion.ROOM}"
    const val ROOM_COMPILER_KAPT = "androidx.room:room-compiler:${LibraryVersion.ROOM}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${CoreVersion.JETPACK_NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${CoreVersion.JETPACK_NAVIGATION}"
    const val PAGING = "androidx.paging:paging-runtime-ktx:${LibraryVersion.PAGING}"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${LibraryVersion.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersion.LIFECYCLE}"
    const val LIFECYCLE_COMMON = "androidx.lifecycle:lifecycle-common-java8:${LibraryVersion.LIFECYCLE}"
    const val KODEIN_JVM = "org.kodein.di:kodein-di-generic-jvm:${LibraryVersion.KODEIN}"
    const val KODEIN_ANDROID = "org.kodein.di:kodein-di-framework-android-x:${LibraryVersion.KODEIN}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${LibraryVersion.RETROFIT}"
    const val RETROFIT_GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${LibraryVersion.GSON_CONVERTER}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${LibraryVersion.OKHTTP}"
    const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${LibraryVersion.OKHTTP}"
    const val RETROFIT_COROUTINES_ADAPTER = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${LibraryVersion.COROUTINES_ADAPTER}"
    const val FIREBASE_REALTIME_DATABASE = "com.google.firebase:firebase-database-ktx:${LibraryVersion.REALTIME_DATABASE}"
    const val FIREBASE_AUTH = "com.google.firebase:firebase-auth-ktx:${LibraryVersion.FIREBASE_AUTH}"
    const val PLAY_SERVICE_AUTH = "com.google.android.gms:play-services-auth:${LibraryVersion.PLAY_SERVICE_AUTH}"

    const val HILT_WORK_MANAGER = "androidx.hilt:hilt-work:${LibraryVersion.HILT_COMPILER}"
    const val HILT_VIEWODEL_COMPILER = "androidx.hilt:hilt-compiler:${LibraryVersion.HILT_COMPILER}"
    const val HILT_VIEWODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${LibraryVersion.HILT_COMPILER}"
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${CoreVersion.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${CoreVersion.HILT}"

    const val SIMPLE_SEARCH_VIEW = "com.github.Ferfalk:SimpleSearchView:${LibraryVersion.SIMPLE_SEARCH_VIEW}"
    const val ANDROIDX_PREFERENCES = "androidx.preference:preference:${LibraryVersion.PREFERENCES}"
    const val FLEXBOX = "com.google.android:flexbox:${LibraryVersion.FLEXBOX}"
    const val LOTTIE = "com.airbnb.android:lottie:${LibraryVersion.LOTTIE}"
    const val ZXING_ANDROID_QR = "com.journeyapps:zxing-android-embedded:${LibraryVersion.ZXING_QR}"
    const val TOASTY = "com.github.GrenderG:Toasty:${LibraryVersion.TOASTY}"
    const val ROUND_BOTTOM_SHEET = "com.github.Deishelon:RoundedBottomSheet:${LibraryVersion.ROUND_BOTTOM_SHEET}"
    const val FLOATING_BUBBLE = "com.github.bijoysingh:floating-bubble:${LibraryVersion.FLOATING_BUBBLE}"
    const val GIF_DRAWABLE = "pl.droidsonroids.gif:android-gif-drawable:${LibraryVersion.GIF_DRAWABLE}"
    const val HVLOG = "io.github.kaustubhpatange:hvlog:${LibraryVersion.HVLOG}"
    const val COIL = "io.coil-kt:coil:${LibraryVersion.COIL}"
    const val GLIDE = "com.github.bumptech.glide:glide:${LibraryVersion.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${LibraryVersion.GLIDE}"
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${LibraryVersion.RECYCLERVIEW}"
    const val CWT = "io.github.kaustubhpatange:cwt:${LibraryVersion.CWT}"
}