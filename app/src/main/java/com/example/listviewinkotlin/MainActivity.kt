package com.example.listviewinkotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView : ListView=findViewById(R.id.listView)
        val listItems= arrayOf("Read a Book","Create a Project","Learn Kotlin","Go for Vaccation","Attend a Lecture")

        val listAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,listItems)
        listView.adapter=listAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem=parent.getItemIdAtPosition(position) as String
            Toast.makeText(this,"You have Clicked $selectedItem", Toast.LENGTH_SHORT).show()

        }
    }
}