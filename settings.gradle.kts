pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GCityKotlin"
include(":app")
includeBuild("version")
include(":lib_base")
include(":lib_network")
include(":lib_voice")
include(":module_manager")
include(":module_constellation")
include(":module_developer")
include(":module_joke")
include(":module_map")
include(":module_setting")
include(":module_weather")
