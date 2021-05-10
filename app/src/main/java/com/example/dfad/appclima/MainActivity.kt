package com.example.dfad.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ciudad = intent.getStringExtra("com.example.dfad.appclima.ciudades.CIUDAD");
    }
}
