pluginManagement {
    repositories {
	google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
	google()
        mavenCentral()
    }
}

rootProject.name = "native-demo"

include(":app", ":db")
