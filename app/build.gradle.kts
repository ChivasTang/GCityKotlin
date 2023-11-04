import com.g.city.version.*
import com.g.city.version.Dependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Libs.namespace
    compileSdk = Libs.compileSdk

    defaultConfig {
        applicationId = Libs.applicationId
        minSdk = Libs.minSdk
        this.targetSdk = Libs.targetSdk
        versionCode = Libs.versionCode
        versionName = Libs.versionName

        testInstrumentationRunner = Libs.testInstrumentationRunner
        vectorDrawables {
            useSupportLibrary = Libs.useSupportLibrary
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = Libs.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile(Libs.optimizeFile),
                Libs.proguardFile
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Libs.jvmTarget
    }
    buildFeatures {
        compose = Libs.compose
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Libs.kotlinCompilerExtensionVersion
    }
    packaging {
        resources {
            excludes += Libs.resourcesExcludes
        }
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeUiGraphics)
    implementation(Dependencies.composeUiToolingPreview)
    implementation(Dependencies.composeMaterial3)
    testImplementation(Dependencies.junit4)
    androidTestImplementation(Dependencies.testExt)
    androidTestImplementation(Dependencies.testEspresso)
    androidTestImplementation(platform(Dependencies.composeBom))
    androidTestImplementation(Dependencies.uiTestJunit4)
    debugImplementation(Dependencies.uiTooling)
    debugImplementation(Dependencies.uiTestManifest)
}