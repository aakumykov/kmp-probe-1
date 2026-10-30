plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.application)
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

    androidTarget {
        compilations.all {
            compilerOptions.configure {
                jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
            }
        }
    }

    sourceSets {
	val commonMain by getting {
            dependencies {
                implementation(project(":db")) 
            }
        }
        val linuxX64Main by getting {
            dependencies {
                implementation(project(":db")) 
            }
        }
	val androidMain by getting {
            dependencies {
                implementation(project(":db")) 
                // При необходимости:
                // implementation("androidx.appcompat:appcompat:1.7.0")
                // implementation("androidx.core:core-ktx:1.13.1")
            }
        }
    }
}

android {
    namespace = "com.github.aakumykov.kmp_native_probe_1"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        applicationId = "com.github.aakumykov.kmp_native_probe_1"
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

