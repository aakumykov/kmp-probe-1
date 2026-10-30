plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    applyDefaultHierarchyTemplate()

    linuxX64 {
        binaries {
            executable {
		entryPoint = "com.github.aakumykov.kmp_native_probe_1.main"
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
