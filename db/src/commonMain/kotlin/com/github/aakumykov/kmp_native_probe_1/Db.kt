package com.github.aakumykov.kmp_native_probe_1.db

fun query(sql: String): String {
    println("[DB] Executing: $sql")
    return "Result of: $sql"
}
