package com.example.veterinaryclinic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.veterinaryclinic.ClinicVeterinary.Companion.prefs

class VaccineInformation : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccine_information)

        val txt_vaccine_name = findViewById<TextView>(R.id.txt_vaccine_name)
        val txt_vaccine_description = findViewById<TextView>(R.id.txt_vaccine_description)
        val txt_vaccine_price = findViewById<TextView>(R.id.txt_vaccine_price)
        val back_home_vaccine_information = findViewById<ImageView>(R.id.back_home_vaccine_information)

        txt_vaccine_name.text = "Vaccine Name: ${prefs.getVaccineName()}"
        txt_vaccine_description.text = "Description: ${prefs.getVaccineDescription()}"
        txt_vaccine_price.text = "Price : $ ${prefs.getVaccinePrice()}"

        back_home_vaccine_information.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}