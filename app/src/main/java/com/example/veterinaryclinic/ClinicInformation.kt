package com.example.veterinaryclinic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.veterinaryclinic.ClinicVeterinary.Companion.prefs

class ClinicInformation : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinic_information)

        val txt_clinic_name = findViewById<TextView>(R.id.txt_clinic_name)
        val txt_clinic_address = findViewById<TextView>(R.id.txt_clinic_address)
        val txt_clinic_phone = findViewById<TextView>(R.id.txt_clinic_phone)
        val back_home_clinic_information = findViewById<ImageView>(R.id.back_home_clinic_information)

        txt_clinic_name.text = "Clinic: ${prefs.getClinicName()}"
        txt_clinic_address.text = "Address: ${prefs.getClinicAddress()}"
        txt_clinic_phone.text = "Phone: ${prefs.getClinicPhone()}"

        back_home_clinic_information.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}