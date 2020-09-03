package com.example.bnccapllication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.button_lookup).apply {
            setOnClickListener{
                openSecondActivityWithImplicitIntent()
                openSecondActivityWithExplicitIntent()
            }
        }
    }

    private fun openSecondActivityWithImplicitIntent() {
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("Key", "Value from intent")
        }
        startActivity(intent)
    }

    private fun openSecondActivityWithExplicitIntent() {
        val intent = Intent(this, LookupActivity::class.java).apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "test")
            type="text/plain"
        }
        if(intent.resolveActivity(packageManager) !== null) {
            startActivity(intent)
        }
    }
}