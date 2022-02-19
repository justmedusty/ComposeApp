plugins {
    id("org.jetbrains.compose") version "1.0.0"
    id("com.android.application")
    kotlin("android")
}

group = "me.dusty"
version = "1.0"

repositories {
    google()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.5.0-alpha02")
    implementation("androidx.navigation:navigation-compose:2.4.1")
    implementation("androidx.camera:camera-camera2:1.0.0-beta03")
}


android {
    compileSdkVersion(32)
    defaultConfig {
        applicationId = "me.dusty.android"
        minSdkVersion(24)
        targetSdkVersion(32)
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
