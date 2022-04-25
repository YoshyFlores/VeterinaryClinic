package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.veterinaryclinic.ClinicVeterinary.Companion.prefs

class MainVaccines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_vaccines)

        val editTextTextVaccineName = findViewById<EditText>(R.id.editTextTextVaccineName)
        val editTextTextVaccineDescription = findViewById<EditText>(R.id.editTextTextVaccineDescription)
        val editTextTextVaccinePrice = findViewById<EditText>(R.id.editTextTextVaccinePrice)
        val btn_save_vaccine = findViewById<Button>(R.id.btn_save_vaccine)
        val back_home_main_vaccines = findViewById<ImageView>(R.id.back_home_main_vaccines)

        back_home_main_vaccines.setOnClickListener {
            val intent = Intent(this, MainAddMenu::class.java)
            startActivity(intent)
        }

        btn_save_vaccine.setOnClickListener {
            if(editTextTextVaccineName.text.toString().isNotEmpty()){
                prefs.saveVaccineName(editTextTextVaccineName.text.toString())
            }else{
                Toast.makeText(this, "Please enter a vaccine name", Toast.LENGTH_SHORT).show()
            }
            if(editTextTextVaccineDescription.text.toString().isNotEmpty()){
                prefs.saveVaccineDescription(editTextTextVaccineDescription.text.toString())
            }else{
                Toast.makeText(this, "Please enter a vaccine description", Toast.LENGTH_SHORT).show()
            }
            if(editTextTextVaccinePrice.text.toString().isNotEmpty()){
                prefs.saveVaccinePrice(editTextTextVaccinePrice.text.toString())
            }else{
                Toast.makeText(this, "Please enter a vaccine price", Toast.LENGTH_SHORT).show()
            }
            if (editTextTextVaccineName.text.toString().isNotEmpty() && editTextTextVaccineDescription.text.toString().isNotEmpty() && editTextTextVaccinePrice.text.toString().isNotEmpty()){
                Toast.makeText(this, "Vaccine saved successfully", Toast.LENGTH_LONG).show()

                // Clear the EditText
                editTextTextVaccineName.text.clear()
                editTextTextVaccineDescription.text.clear()
                editTextTextVaccinePrice.text.clear()

                goToDetailsVaccine()
            }else{
                Toast.makeText(this, "Error, don't save successfully", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun goToDetailsVaccine(){
        val intent = Intent(this, VaccineInformation::class.java)
        startActivity(intent)
    }
}