package com.alexbar10.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll"
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        //val resultImage: ImageView = findViewById(R.id.dice_image)
        val randomNumber = Random().nextInt(5) + 1
        val uri = "@drawable/dice_$randomNumber"
        val imgResource = resources.getIdentifier(uri, null, packageName)
        diceImage.setImageResource(imgResource)
    }
}