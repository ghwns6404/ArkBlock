plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.8" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}
