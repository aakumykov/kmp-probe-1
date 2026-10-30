package com.github.aakumykov.kmp_native_probe_1

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.github.aakumykov.kmp_native_probe_1.db.query

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val result = query("SELECT * FROM users")

        val textView = TextView(this).apply {
            text = "Hello from Android KMP!\n\n$result"
            setPadding(32, 32, 32, 32)
        }
        setContentView(textView)
    }
}
