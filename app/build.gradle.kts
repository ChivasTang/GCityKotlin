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
    implementation(fileTree(Libs.fileTreeMap))
    implementation(project(Libs.projectLibBase))

    if (!Modules.moduleIsApp) {
        implementation(project(Libs.projectModuleConstellation))
        implementation(project(Libs.projectModuleDeveloper))
        implementation(project(Libs.projectModuleJoke))
        implementation(project(Libs.projectModuleManager))
        implementation(project(Libs.projectModuleMap))
        implementation(project(Libs.projectModuleSetting))
        implementation(project(Libs.projectModuleWeather))
    }
}