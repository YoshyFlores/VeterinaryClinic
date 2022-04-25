package com.example.veterinaryclinic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.veterinaryclinic.ClinicVeterinary.Companion.prefs

class PetInformation : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_information)

        val txt_pet_name = findViewById<TextView>(R.id.txt_pet_name)
        val txt_pet_race = findViewById<TextView>(R.id.txt_pet_race)
        val txt_pet_age = findViewById<TextView>(R.id.txt_pet_age)
        val txt_pet_name_owner = findViewById<TextView>(R.id.txt_pet_name_owner)
        val back_home_pet_information = findViewById<ImageView>(R.id.back_home_pet_information)

        txt_pet_name.text = "Pet Name: ${prefs.getNamePet()}"
        txt_pet_race.text = "Pet Race: ${prefs.getRacePet()}"
        txt_pet_age.text = "Pet Age: ${prefs.getAgePet()}"
        txt_pet_name_owner.text = "Pet Owner Name: ${prefs.getPetNameOwner()}"

        back_home_pet_information.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}