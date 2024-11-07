package com.example.primercontactov2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class resultadoActivity : AppCompatActivity() {

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        val textoRes = findViewById<AppCompatTextView>(R.id.textoFinal)
        val nombre = intent?.extras?.getString("EXTRA_NAME").orEmpty()
        textoRes.setText(nombre)
    }
}