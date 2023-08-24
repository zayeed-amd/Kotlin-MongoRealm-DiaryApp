import org.jetbrains.kotlin.kapt3.base.Kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("io.realm.kotlin")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
//    id("com.google.gms.google-services")
    //kotlin("kapt") version "1.9.10"
    id("com.google.dagger.hilt.android")

}

android {
    namespace = "com.example.diary"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.diary"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_18
//        targetCompatibility = JavaVersion.VERSION_18
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //compose Navigation
    implementation("androidx.navigation:navigation-compose:2.7.1")

    // firebase
    implementation("com.google.firebase:firebase-auth-ktx:22.1.1")
    implementation("com.google.firebase:firebase-storage-ktx:20.2.1")

    // room components
    implementation("androidx.room:room-runtime:2.5.2")
    kapt("androidx.room:room-compiler:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")

    // runtime compose
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.1")

    //Splash API
    implementation("androidx.core:core-splashscreen:1.0.1")

    // MongoDB Realm
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0-native-mt"){
        version{
            strictly("1.6.0-native-mt")
        }
    }

    implementation("io.realm.kotlin:library-sync:1.0.2")

    // Dagger Hilt
    implementation("com.google.dagger:hilt-android:2.44.2")

    kapt("com.google.dagger:hilt-compiler:2.44.2")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    // Google Auth
    // implementation("com.google.android.gms:play-services-auth:20.6.0")

    // Coil
    implementation("io.coil-kt:coil-compose:2.2.2")

    // Pager Accompanist
    implementation("com.google.accompanist:accompanist-pager:0.27.0")

    // Date-Time
    implementation("io.github.vanpra.compose-material-dialogs:datetime:0.9.0")

    // Message Bar Compose
    implementation("com.github.stevdza-san:MessageBarCompose:1.0.5")

    // One-Tap Compose
    // https://github.com/stevdza-san/OneTapCompose
    implementation("com.github.stevdza-san:OneTapCompose:1.0.7")

    // Desugar JDK
    coreLibraryDesugaring("com.android.tools.desugar_jdk_libs:1.2.0")
}