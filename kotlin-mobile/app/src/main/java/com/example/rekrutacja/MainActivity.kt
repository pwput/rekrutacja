package com.example.rekrutacja


import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.rekrutacja.databinding.ActivityMainBinding
import java.lang.Character.toUpperCase

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            onButtonClick()
        }

        binding.button2.setOnClickListener {
            onYourButtonClick()
        }
    }

    /*1.TODO Pierwszym z zadań jest implementacja metody, w taki sposób, aby
            kliknięcie przycisku powodowało otwarcie activity SecondActivity, gdy
            wpisanym przez użytkownika tekstem jest 'AKAI'.
            Kolejne zadanie znajdziesz w pliku activity_main.xml.

            Podpowiedź poczytaj o Intent.
     */
    private fun onButtonClick() {
        binding.textView.text = binding.editText.text.toString()
        val editText  = findViewById<EditText>(R.id.editText)

        val input = editText.text.toString()

        val intent = Intent(this, SecondActivity::class.java).apply {}
        if (input == "AKAI")
            startActivity(intent)
    }

    /*2.b TODO Druga część tego zadania polega na implementacji metody, która zmienia
            wszyskie litery we wpisanym przez użytkownika tekscie na wielkie i
            wstawienie przerobionego tekstu do textView. Nie zapomnij dodać do metody
            OnCreate() OnClickListenera słuchającego na kliknięcia wstawionego przez Ciebie
            przycisku.
            Kolejne zadanie czeka na Ciebie w pliku SecondActivity
     */
    private fun onYourButtonClick() {
        val editText = findViewById<EditText>(R.id.editText)
        var text = editText.text.toString().uppercase()
        editText.setText(text)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = editText.text.toString()
    }
}
