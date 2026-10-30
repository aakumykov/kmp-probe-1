package db

fun connectToDatabase() {
    println("[DB] Connecting to database...")
}

fun query(sql: String): String {
    println("[DB] Executing: $sql")
    return "Result of: $sql"
}
