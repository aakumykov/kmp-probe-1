plugins {
    kotlin("multiplatform") version "2.1.20"
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
