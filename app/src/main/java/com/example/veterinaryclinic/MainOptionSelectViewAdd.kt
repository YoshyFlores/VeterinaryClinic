package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainOptionSelectViewAdd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_option_select_view_add)

        val btn_view_information = findViewById<Button>(R.id.btn_view_information)
        val btn_add_information = findViewById<Button>(R.id.btn_add_information)
        val img_button_info_team = findViewById<ImageButton>(R.id.img_button_info_team)


        img_button_info_team.setOnClickListener {
            val intent = Intent(this, MainDevs::class.java)
            startActivity(intent)
        }

        btn_view_information.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }

        btn_add_information.setOnClickListener {
            val intent = Intent(this, MainAddMenu::class.java)
            startActivity(intent)
        }
    }
}