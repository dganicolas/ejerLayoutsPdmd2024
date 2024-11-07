    package com.example.primercontactov2

    import android.annotation.SuppressLint
    import android.content.Intent
    import android.os.Bundle
    import androidx.activity.enableEdgeToEdge
    import androidx.appcompat.app.AppCompatActivity
    import androidx.appcompat.widget.AppCompatTextView
    import androidx.core.view.ViewCompat
    import androidx.core.view.WindowInsetsCompat

    class MainActivity2 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)
            val textoRes = findViewById<AppCompatTextView>(R.id.textoFinal)
            var nombre = intent?.extras?.getString("EXTRA_NAME").orEmpty()
            textoRes.setText("hola $nombre")

        }
    }