import db.connectToDatabase
import db.query

fun main() {
    println("Hello from Kotlin/Native multi-module project!")
    connectToDatabase()
    val result = query("SELECT * FROM users")
    println("App received: $result")
}
