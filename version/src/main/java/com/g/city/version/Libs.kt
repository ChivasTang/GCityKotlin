package com.g.city.version

import org.gradle.api.file.FileTree

object Libs {
    const val compileSdk = 34
    const val targetSdk = 34
    const val minSdk = 26
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val consumerProguardFiles = "consumer-rules.pro"
    const val optimizeFile = "proguard-android-optimize.txt"
    const val proguardFile = "proguard-rules.pro"
    const val applicationId = "com.g.city"
    const val namespace = "com.g.city"
    const val versionCode = 1
    const val versionName = "1.0"
    const val useSupportLibrary = true
    const val isMinifyEnabled = false
    const val jvmTarget = "1.8"
    const val kotlinCompilerExtensionVersion = "1.4.3"
    const val compose = true
    const val resourcesExcludes = "/META-INF/{AL2.0,LGPL2.1}"

    val fileTreeMap = mapOf("dir" to "libs", "include" to listOf("*.jar"))

    // lib
    const val nameSpaceLibBase = "com.g.city.base"
    const val nameSpaceLibNetwork = "com.g.city.network"
    const val nameSpaceLibVoice = "com.g.city.voice"

    // module
    const val nameSpaceModuleConstellation = "com.g.city.constellation"
    const val nameSpaceModuleDeveloper = "com.g.city.developer"
    const val nameSpaceModuleJoke = "com.g.city.joke"
    const val nameSpaceModuleManager = "com.g.city.manager"
    const val nameSpaceModuleMap = "com.g.city.map"
    const val nameSpaceModuleSetting = "com.g.city.setting"
    const val nameSpaceModuleWeather = "com.g.city.weather"

    const val projectLibBase = ":lib_base"
    const val projectLibNetwork = ":lib_network"
    const val projectLibVoice = ":lib_voice"
    const val projectModuleManager = ":module_manager"
    const val projectModuleConstellation = ":module_constellation"
    const val projectModuleDeveloper = ":module_developer"
    const val projectModuleJoke = ":module_joke"
    const val projectModuleMap = ":module_map"
    const val projectModuleSetting = ":module_setting"
    const val projectModuleWeather = ":module_weather"
}

