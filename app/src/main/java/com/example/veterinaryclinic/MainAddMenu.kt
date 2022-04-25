package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainAddMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_add_menu)

        val img_add_Veterinarian = findViewById<ImageView>(R.id.img_add_Veterinarian)
        val img_add_Pet = findViewById<ImageView>(R.id.img_add_Pet)
        val img_add_Vaccine = findViewById<ImageView>(R.id.img_add_Vaccine)
        val img_add_ClinicInfo = findViewById<ImageView>(R.id.img_add_ClinicInfo)
        val back_home_add_menu = findViewById<ImageView>(R.id.back_home_add_menu)

        back_home_add_menu.setOnClickListener {
            val intent = Intent(this, MainOptionSelectViewAdd::class.java)
            startActivity(intent)
        }

        //    Set OnClickListener to each ImageView to open the corresponding activity
        //    Add Information
        img_add_Veterinarian.setOnClickListener {
            val intent = Intent(this, MainVeterinarian::class.java)
            startActivity(intent)
        }

        img_add_Pet.setOnClickListener {
            val intent = Intent(this, MainPets::class.java)
            startActivity(intent)
        }

        img_add_Vaccine.setOnClickListener {
            val intent = Intent(this, MainVaccines::class.java)
            startActivity(intent)
        }

        img_add_ClinicInfo.setOnClickListener {
            val intent = Intent(this, MainClinicInfo::class.java)
            startActivity(intent)
        }

    }
}