package com.example.veterinaryclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    val durationSplashScreen : Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeActivity()
    }
    private fun changeActivity(){
        Handler().postDelayed(Runnable {
            val next = Intent(this, MainOptionSelectViewAdd::class.java)
            startActivity(next)
        }, durationSplashScreen)
    }
}