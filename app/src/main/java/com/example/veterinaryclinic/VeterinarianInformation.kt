package com.example.veterinaryclinic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.veterinaryclinic.ClinicVeterinary.Companion.prefs

class VeterinarianInformation : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veterinarian_information)

        val txt_name_veterinarian = findViewById<TextView>(R.id.txt_name_veterinarian)
        val txt_phone_veterinarian = findViewById<TextView>(R.id.txt_phone_veterinarian)
        val txt_specialty_veterinarian = findViewById<TextView>(R.id.txt_specialty_veterinarian)
        val txt_work_clinic_veterinarian = findViewById<TextView>(R.id.txt_work_clinic_veterinarian)
        val back_home_veterinarian_information = findViewById<ImageView>(R.id.back_home_veterinarian_information)

        txt_name_veterinarian.text = "Name: ${prefs.getNameVeterinarian()}"
        txt_phone_veterinarian.text = "Phone: ${prefs.getPhoneVeterinarian()}"
        txt_specialty_veterinarian.text = "Specialty: ${prefs.getSpecialtyVeterinarian()}"
        txt_work_clinic_veterinarian.text = "Address Clinic: ${prefs.getWorkClinicVeterinarian()}"

        back_home_veterinarian_information.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}