package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    var names = listOf("Ann", "Beth", "Carol", "Olga", "Esther", "Agnes", "Dorothy")
    var rvNames = findViewById<RecyclerView>(R.id.rvNames)
    rvNames.layoutManager=LinearLayoutManager(baseContext)
    var namesAdapter=NamesRvAdapter(names)
    rvNames.adapter=namesAdapter

}

}