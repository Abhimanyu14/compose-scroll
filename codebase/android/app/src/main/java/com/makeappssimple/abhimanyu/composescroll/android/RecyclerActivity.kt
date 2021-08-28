package com.makeappssimple.abhimanyu.composescroll.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val data = Array(20) { "Item $it" }
        recyclerView.adapter = Adapter(data = data)
    }
}
