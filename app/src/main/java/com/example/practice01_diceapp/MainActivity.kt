package com.example.practice01_diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Integer.parseInt
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private fun randomRoll(){
        val textMsg : TextView = findViewById(R.id.resultTextView)
        var generatedRandomNumber = Random.nextInt(6) + 1
        textMsg.text = generatedRandomNumber.toString()
    }

    private fun countUp(){
        var textMsg : TextView = findViewById(R.id.resultTextView)
        var rolledNumber : Int

        try{
            rolledNumber = parseInt(textMsg.text.toString())

            if(rolledNumber < 6) textMsg.text = (rolledNumber + 1).toString()

        }catch(e : Exception) {
            println("String to Integer unsuccessful")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll : Button = findViewById(R.id.rollButton)
        val buttonCountUp : Button = findViewById(R.id.countupButton)

        buttonRoll.setOnClickListener {
            randomRoll()
        }

        buttonCountUp.setOnClickListener {
            countUp()
        }
    }
}
