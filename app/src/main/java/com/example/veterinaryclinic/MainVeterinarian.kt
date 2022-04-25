package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.veterinaryclinic.ClinicVeterinary.Companion.prefs

class MainVeterinarian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_veterinarian)

        //  Declare the variables
        val editTextTextVeterinarianName = findViewById<EditText>(R.id.editTextTextVeterinarianName)
        val editTextTextVeterinaryPhone = findViewById<EditText>(R.id.editTextTextVeterinaryPhone)
        val editTextTextVeterinarySpecialty = findViewById<EditText>(R.id.editTextTextVeterinarySpecialty)
        val editTextTextVeterinaryWorkClinic = findViewById<EditText>(R.id.editTextTextVeterinaryWorkClinic)
        val btn_save_veterinarian = findViewById<Button>(R.id.btn_save_veterinarian)
        val back_home_main_veterinarian = findViewById<ImageView>(R.id.back_home_main_veterinarian)

        //  Set the click listener for the button

        back_home_main_veterinarian.setOnClickListener {
            val intent = Intent(this, MainAddMenu::class.java)
            startActivity(intent)
        }

        btn_save_veterinarian.setOnClickListener {
            if (editTextTextVeterinarianName.text.toString().isNotEmpty()){
                prefs.saveNameVeterinarian(editTextTextVeterinarianName.text.toString())
            }else{
                Toast.makeText(this, "Please enter Veterinarian name", Toast.LENGTH_SHORT).show()
            }
            if (editTextTextVeterinaryPhone.text.toString().isNotEmpty()){
                prefs.savePhoneVeterinarian(editTextTextVeterinaryPhone.text.toString())
            }else{
                Toast.makeText(this, "Please enter Veterinarian phone", Toast.LENGTH_SHORT).show()
            }
            if (editTextTextVeterinarySpecialty.text.toString().isNotEmpty()){
                prefs.saveSpecialtyVeterinarian(editTextTextVeterinarySpecialty.text.toString())
            }else{
                Toast.makeText(this, "Please enter Veterinarian specialty", Toast.LENGTH_SHORT).show()
            }
            if (editTextTextVeterinaryWorkClinic.text.toString().isNotEmpty()){
                prefs.saveWorkClinicVeterinarian(editTextTextVeterinaryWorkClinic.text.toString())
            }else{
                Toast.makeText(this, "Please enter Veterinarian work clinic", Toast.LENGTH_SHORT).show()
            }
            if (editTextTextVeterinarianName.text.toString().isNotEmpty() && editTextTextVeterinaryPhone.text.toString().isNotEmpty() && editTextTextVeterinarySpecialty.text.toString().isNotEmpty() && editTextTextVeterinaryWorkClinic.text.toString().isNotEmpty()){
                Toast.makeText(this, "Veterinarian saved successfully", Toast.LENGTH_LONG).show()

                //  Clear the EditTexts
                editTextTextVeterinarianName.text.clear()
                editTextTextVeterinaryPhone.text.clear()
                editTextTextVeterinarySpecialty.text.clear()
                editTextTextVeterinaryWorkClinic.text.clear()

                goToDetailsVeterinarian()
            }else{
                Toast.makeText(this, "Error, don't save successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun goToDetailsVeterinarian(){
        val intent = Intent(this, VeterinarianInformation::class.java)
        startActivity(intent)
    }
}