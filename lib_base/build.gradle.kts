import com.g.city.version.*
import com.g.city.version.Dependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Libs.nameSpaceLibBase
    compileSdk = Libs.compileSdk
    defaultConfig {
        minSdk = Libs.minSdk

        testInstrumentationRunner = Libs.testInstrumentationRunner
        consumerProguardFiles(Libs.consumerProguardFiles)
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
}

dependencies {
    implementation(fileTree(Libs.fileTreeMap))
    api(Dependencies.coreKtx)
    api(Dependencies.appCompat)
    api(Dependencies.material)
    api(Dependencies.lifecycleRuntimeKtx)
    api(Dependencies.activityCompose)
    api(platform(Dependencies.composeBom))
    api(Dependencies.composeUi)
    api(Dependencies.composeUiGraphics)
    api(Dependencies.composeUiToolingPreview)
    api(Dependencies.composeMaterial3)
    testApi(Dependencies.junit4)
    androidTestApi(Dependencies.testExt)
    androidTestApi(Dependencies.testEspresso)
    androidTestApi(platform(Dependencies.composeBom))
    androidTestApi(Dependencies.uiTestJunit4)
    debugApi(Dependencies.uiTooling)
    debugApi(Dependencies.uiTestManifest)

    api(project(Libs.projectLibNetwork))
    api(project(Libs.projectLibVoice))
}