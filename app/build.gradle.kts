plugins {
    kotlin("multiplatform")
}

kotlin {
    applyDefaultHierarchyTemplate()

    linuxX64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        val linuxX64Main by getting {
            dependencies {
                implementation(project(":db"))
            }
        }
    }
}
