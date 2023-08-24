// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
//    ext {
//        compose_version = "1.3.1"
//    }
    dependencies{
//        classpath("com.google.gms:google-services:4.3.15")
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin")
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("io.realm.kotlin") version "1.0.2" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}