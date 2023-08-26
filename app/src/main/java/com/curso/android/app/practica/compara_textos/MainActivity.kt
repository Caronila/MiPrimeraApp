package com.curso.android.app.practica.compara_textos
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider




class MainActivity : ComponentActivity() {
    private lateinit var viewModel: TextComparisonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            viewModel = ViewModelProvider(this)[TextComparisonViewModel::class.java]

            val editText1: EditText = findViewById(R.id.editText1)
            val editText2: EditText = findViewById(R.id.editText2)
            val compareButton = findViewById<Button>(R.id.compareButton)
            val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Inicializar la instance del ViewModel
        viewModel = ViewModelProvider(this)[TextComparisonViewModel::class.java]


        // Configurar el listener para el clic del botón
        compareButton.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()
            viewModel.compareTexts(text1, text2)
        }

        viewModel.areTextsEqual.observe(this) { areEqual ->
            resultTextView.text = if (areEqual) "Los textos son iguales"
            else "Los textos no son iguales"
        }
    }
}






