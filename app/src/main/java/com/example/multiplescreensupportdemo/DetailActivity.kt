package com.example.multiplescreensupportdemo


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

//        // Retrieve data coming from MainActivity.java
//        val description = intent.getStringExtra("description")
//        val title = intent.getStringExtra("title")
//
//        // Pass the data to FragmentB to display it
//        val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
//        fragmentB?.displayDetails(title, description)
    }
}