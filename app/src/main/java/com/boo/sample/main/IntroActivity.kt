package com.boo.sample.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        goToMainActivity()
    }

    private fun goToMainActivity() {
        Handler(mainLooper).postDelayed({
            val mainIntent = Intent(applicationContext, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, 1000)
    }
}