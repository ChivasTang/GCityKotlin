package com.g.city.version

import org.gradle.api.Plugin
import org.gradle.api.Project
class VersionPlugin :Plugin<Project>{
    override fun apply(target: Project) {
        with(target){
            with(pluginManager){
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }
        }
    }
}