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
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    testImplementation(Dependencies.junit4)
    androidTestImplementation(Dependencies.testExt)
    androidTestImplementation(Dependencies.testEspresso)
}