package com.themmit.registration.investor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.themmit.registration.investor.helpers.Auths

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Auths.isLoggedIn(this) == true) {
            var intent: Intent? = null
            if (Auths.getLogginType(this) == "admin") {
                // intent = Intent(this)
            } else if (Auths.getLogginType(this) == "agent") {
            } else {
            }
            startActivity(intent)
            finish()
        }
    }
}