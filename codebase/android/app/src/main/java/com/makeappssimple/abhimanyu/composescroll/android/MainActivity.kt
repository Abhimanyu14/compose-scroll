package com.makeappssimple.abhimanyu.composescroll.android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.recycler).setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }

        findViewById<Button>(R.id.compose).setOnClickListener {
            startActivity(Intent(this, ComposeActivity::class.java))
        }
    }
}
