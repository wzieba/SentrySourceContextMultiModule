plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("io.sentry.android.gradle") version "4.4.0"
}

sentry {
    org.set("sourcestest")
    projectName.set("android")
    authToken.set(System.getenv("SENTRY_AUTH_TOKEN"))
    includeSourceContext.set(true)
}

android {
    namespace = "io.github.wzieba.sentrysourcecontextmultimodule"
    compileSdk = 34

    defaultConfig {
        applicationId = "io.github.wzieba.sentrysourcecontextmultimodule"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":y"))
}
