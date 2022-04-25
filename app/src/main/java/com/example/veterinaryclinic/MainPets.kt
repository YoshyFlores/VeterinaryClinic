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

class MainPets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pets)

        val editTextTextPetName = findViewById<EditText>(R.id.editTextTextPetName)
        val editTextTextPetRace = findViewById<EditText>(R.id.editTextTextPetRace)
        val editTextTextPetAge = findViewById<EditText>(R.id.editTextTextPetAge)
        val editTextTextNamePetOwner = findViewById<EditText>(R.id.editTextTextNamePetOwner)
        val btn_save_pet = findViewById<Button>(R.id.btn_save_pet)
        val back_home_main_pets = findViewById<ImageView>(R.id.back_home_main_pets)

        back_home_main_pets.setOnClickListener {
            val intent = Intent(this, MainAddMenu::class.java)
            startActivity(intent)
        }

        btn_save_pet.setOnClickListener {
            if(editTextTextPetName.text.toString().isNotEmpty()) {
                prefs.saveNamePet(editTextTextPetName.text.toString())
            }else{
                Toast.makeText(this, "Please, enter the name of the pet", Toast.LENGTH_SHORT).show()
            }
            if(editTextTextPetRace.text.toString().isNotEmpty()) {
                prefs.saveRacePet(editTextTextPetRace.text.toString())
            }else {
                Toast.makeText(this, "Please, enter the Race of the Pets", Toast.LENGTH_SHORT).show()
            }
            if(editTextTextPetAge.text.toString().isNotEmpty()) {
                prefs.saveAgePet(editTextTextPetAge.text.toString())
            }else{
                Toast.makeText(this, "Please, enter the Age of the Pets",Toast.LENGTH_SHORT).show()
            }
            if(editTextTextNamePetOwner.text.toString().isNotEmpty()) {
                prefs.savePetNameOwner(editTextTextNamePetOwner.text.toString())
            }else{
                Toast.makeText(this, "Please, enter the Name of the Owner Pet",Toast.LENGTH_SHORT).show()
            }
            if (editTextTextPetName.text.toString().isNotEmpty() && editTextTextPetRace.text.toString().isNotEmpty() && editTextTextPetAge.text.toString().isNotEmpty() && editTextTextNamePetOwner.text.toString().isNotEmpty()) {
                Toast.makeText(this, "Pet Saved successfully", Toast.LENGTH_SHORT).show()

                // Clear the EditTexts
                editTextTextPetName.text.clear()
                editTextTextPetRace.text.clear()
                editTextTextPetAge.text.clear()
                editTextTextNamePetOwner.text.clear()

                gotToDetailPets()
            }else{
                Toast.makeText(this, "Error, don't save successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun gotToDetailPets(){
        val intent = Intent(this, PetInformation::class.java)
        startActivity(intent)
    }
}