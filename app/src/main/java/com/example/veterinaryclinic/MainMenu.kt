package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        //    Declare the variables
        val img_option_Veterinarian = findViewById<ImageView>(R.id.img_option_Veterinarian)
        val img_option_Pets = findViewById<ImageView>(R.id.img_option_Pets)
        val img_option_Vaccines = findViewById<ImageView>(R.id.img_option_Vaccines)
        val img_option_ClinicInfo = findViewById<ImageView>(R.id.img_option_ClinicInfo)
        val back_home_main_menu = findViewById<ImageView>(R.id.back_home_main_menu)

        back_home_main_menu.setOnClickListener {
            val intent = Intent(this, MainOptionSelectViewAdd::class.java)
            startActivity(intent)
        }

        //    Set OnClickListener to each ImageView to open the corresponding activity
        //    View Information
        img_option_Veterinarian.setOnClickListener {
            //    Open VeterinarianActivity
            val intent = Intent(this, VeterinarianInformation::class.java)
            startActivity(intent)
        }
        img_option_Pets.setOnClickListener {
            //    Open PetsActivity
            val intent = Intent(this, PetInformation::class.java)
            startActivity(intent)
        }
        img_option_Vaccines.setOnClickListener {
            //    Open VaccinesActivity
            val intent = Intent(this, VaccineInformation::class.java)
            startActivity(intent)
        }
        img_option_ClinicInfo.setOnClickListener {
            //    Open ClinicInfoActivity
            val intent = Intent(this, ClinicInformation::class.java)
            startActivity(intent)
        }
    }
}