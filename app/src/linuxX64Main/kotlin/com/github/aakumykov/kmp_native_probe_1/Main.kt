package com.github.aakumykov.kmp_native_probe_1

import com.github.aakumykov.kmp_native_probe_1.db.connectToDatabase
import com.github.aakumykov.kmp_native_probe_1.db.query

fun main() {
    println("Hello from Kotlin/Native multi-module project!")
    connectToDatabase()
    val result = query("SELECT * FROM users")
    println("App received: $result")
}
