package com.g.city.version

object Dependencies {
    private const val coreKtxVersion = "1.12.0"
    private const val lifecycleRuntimeKtxVersion = "2.6.2"
    private const val activityComposeVersion = "1.8.0"
    private const val composeBomVersion = "2023.10.01"
    private const val junit4Version = "4.13.2"
    private const val testExtJunit = "1.1.5"
    private const val testEspressoCore = "3.5.1"

    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeKtxVersion"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
    const val composeBom = "androidx.compose:compose-bom:$composeBomVersion"
    const val composeUi = "androidx.compose.ui:ui"
    const val composeUiGraphics = "androidx.compose.ui:ui-graphics"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeMaterial3 = "androidx.compose.material3:material3"
    const val junit4= "junit:junit:$junit4Version"
    const val testExt = "androidx.test.ext:junit:$testExtJunit"
    const val testEspresso = "androidx.test.espresso:espresso-core:$testEspressoCore"
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"

}