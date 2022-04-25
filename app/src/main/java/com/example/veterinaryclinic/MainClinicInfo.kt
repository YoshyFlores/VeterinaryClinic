package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.veterinaryclinic.ClinicVeterinary.Companion.prefs

class MainClinicInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_clinic_info)

        val editTextTextClinicName = findViewById<EditText>(R.id.editTextTextClinicName)
        val editTextTextAddressClinic = findViewById<EditText>(R.id.editTextTextAddressClinic)
        val editTextPhoneClinic = findViewById<EditText>(R.id.editTextPhoneClinic)
        val btn_save_info_clinic = findViewById<Button>(R.id.btn_save_info_clinic)
        val back_home_main_clinic_info = findViewById<ImageView>(R.id.back_home_main_clinic_info)

        back_home_main_clinic_info.setOnClickListener {
            val intent = Intent(this, MainAddMenu::class.java)
            startActivity(intent)
        }
        btn_save_info_clinic.setOnClickListener {
            if (editTextTextClinicName.text.toString().isNotEmpty()) {
                prefs.saveClinicName(editTextTextClinicName.text.toString())
            }else{
                Toast.makeText(this, "Please, enter Clinic Name", Toast.LENGTH_SHORT).show()
            }
            if (editTextTextAddressClinic.text.toString().isNotEmpty()) {
                prefs.saveClinicAddress(editTextTextAddressClinic.text.toString())
            }else{
                Toast.makeText(this, "Please, enter Clinic Address", Toast.LENGTH_SHORT).show()
            }
            if (editTextPhoneClinic.text.toString().isNotEmpty()) {
                prefs.saveClinicPhone(editTextPhoneClinic.text.toString())
            }else{
                Toast.makeText(this, "Please, enter Clinic Phone", Toast.LENGTH_SHORT).show()
            }
            if (editTextTextClinicName.text.toString().isNotEmpty() && editTextTextAddressClinic.text.toString().isNotEmpty() && editTextPhoneClinic.text.toString().isNotEmpty()) {
                Toast.makeText(this, "Information saved successfully", Toast.LENGTH_LONG).show()

                //  Clear the EditTexts
                editTextTextClinicName.text.clear()
                editTextTextAddressClinic.text.clear()
                editTextPhoneClinic.text.clear()

                goToDetailsClinic()
            }else{
                Toast.makeText(this, "Error, don't save successfully", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun goToDetailsClinic() {
        val intent = android.content.Intent(this, ClinicInformation::class.java)
        startActivity(intent)
    }
}