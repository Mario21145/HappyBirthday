package com.example.happybirthtday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//Class dice
class dice(var numberSides: Int){
    fun roll(): Int{
        return (1..numberSides).random()
    }
}

//Creation of the dice and the logic
val d1 = dice(20)
val d1Roll = d1.roll()

