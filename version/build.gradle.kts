plugins {
    `kotlin-dsl`
}
buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10")
}

gradlePlugin {
    plugins {
        create("version") {
            id = "com.g.city.version"
            implementationClass = "com.g.city.version.VersionPlugin"
        }
    }
}
repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}