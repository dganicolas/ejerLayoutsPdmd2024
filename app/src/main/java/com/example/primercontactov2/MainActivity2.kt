    package com.example.primercontactov2

    import android.os.Bundle
    import android.util.Log
    import androidx.appcompat.app.AppCompatActivity
    import androidx.appcompat.widget.AppCompatTextView
    import androidx.constraintlayout.widget.ConstraintLayout
    import androidx.core.content.ContextCompat

    class MainActivity2 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)
            val view2 = findViewById<ConstraintLayout>(R.id.view2)
            val textoRes = findViewById<AppCompatTextView>(R.id.textoFinal)
            var nombre = intent?.extras?.getString("EXTRA_NAME").orEmpty()
            var color = intent?.extras?.getInt("EXTRA_COLOR")
            Log.i("XD", color.toString())
            if(color != null){
                view2.setBackgroundColor(ContextCompat.getColor(this,color))
            }
            textoRes.setText("hola $nombre")
        }
    }