package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainDevs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_devs)

        val btn_go_home = findViewById<ImageView>(R.id.btn_go_home)

        btn_go_home.setOnClickListener {
            val intent = Intent(this, MainOptionSelectViewAdd::class.java)
            startActivity(intent)
        }

    }
}