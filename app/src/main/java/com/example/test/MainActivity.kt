package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// Доценко Александр ИС1-Б21
// 9. Вычислите среднее значение всех четных элементов списка, находящихся в нечетных местах.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewResults: TextView = findViewById(R.id.textViewResults)
        val button: Button = findViewById(R.id.button)
        val editTextViev: EditText = findViewById(R.id.editTextListOfNumbers)

        button.setOnClickListener {
            var var9 = TaskClass(editTextViev.text.toString())
            if (editTextViev.text.toString() == "") editTextViev.setText(var9.generateInitialString())
            textViewResults.setText(var9.task().toString())
        }

    }
}