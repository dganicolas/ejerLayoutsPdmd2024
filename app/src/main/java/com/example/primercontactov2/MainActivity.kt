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
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var estado = true

    var color: Int = R.color.black
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
                intento.putExtra("EXTRA_COLOR",color)
                intento.putExtra("EXTRA_NAME",textito)
                startActivity(intento)
            }
        }

        //con esta parte la tarea esta completa
        btnCambiarColor.setOnClickListener{
            val mainLayout = findViewById<ConstraintLayout>(R.id.main)
            if(!estado){
                color= R.color.white
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,color))
                estado = false
            }else{
                color =R.color.black
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,color))
                estado = true
            }

        }
    }
}