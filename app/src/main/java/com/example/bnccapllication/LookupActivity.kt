package com.example.bnccapllication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class LookupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lookup)

        val explicitIntentMessage = intent.getStringExtra("Key")
        val implicitIntentMessage = intent.getStringExtra(Intent.EXTRA_TEXT)

        val textViewExplicitIntent = findViewById<TextView>(R.id.text_view1).apply {
            text = explicitIntentMessage
        }

        val textViewImplicitIntent = findViewById<TextView>(R.id.text_view2).apply {
            text =  implicitIntentMessage.toString()
        }
    }
}