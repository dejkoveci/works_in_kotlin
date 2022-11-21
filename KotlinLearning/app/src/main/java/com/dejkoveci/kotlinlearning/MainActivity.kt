package com.dejkoveci.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //variables & constants

        var x = 5
        var y = 4

        println(x*y)

        var age = 35

        println(age / 7 * 5)

        age = 36

        println(age)

        val name = "Furkan"

        val a = 5

    }
}