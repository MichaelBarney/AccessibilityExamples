package com.example.accessibilityexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val color = findViewById<Button>(R.id.color)
        color.setOnClickListener{
            val intent = Intent(baseContext, ColorContrastActivity::class.java)
            startActivity(intent)
        }
        val content = findViewById<Button>(R.id.content)
        content.setOnClickListener{
            val intent = Intent(baseContext, ContentDescriptionActivity::class.java)
            startActivity(intent)
        }
        val hierarchy = findViewById<Button>(R.id.hierarchy)
        hierarchy.setOnClickListener{
            val intent = Intent(baseContext, HierarchyActivity::class.java)
            startActivity(intent)
        }
        val layout = findViewById<Button>(R.id.layout)
        layout.setOnClickListener{
            val intent = Intent(baseContext, TextLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}
