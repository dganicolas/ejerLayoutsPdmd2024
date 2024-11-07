package com.example.primercontactov2

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    var estado = true
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val btnCambiarColor = findViewById<Button>(R.id.btnCambiarColor)

        btnEnviar.setOnClickListener{
            val textoEdit = findViewById<EditText>(R.id.textoEdit)
            val textito = textoEdit.text.toString()
            if (textito.isNotEmpty()){
                val intento = Intent(this, MainActivity2::class.java)
                intento.putExtra("EXTRA_NAME",textito)
                startActivity(intento)
            }
        }

        btnCambiarColor.setOnClickListener{
            val mainLayout = findViewById<ConstraintLayout>(R.id.main)
            if(estado){
                mainLayout.setBackgroundColor(R.color.white)
                estado = false
            }else{
                mainLayout.setBackgroundColor(R.color.black)
                estado = true
            }

        }
    }
}