package com.example.threeextensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.threeextensions.extensions.factorial
import com.example.threeextensions.extensions.toNegative
import com.example.threeextensions.extensions.toTelephoneNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val telephoneExample = "79856549878"
        val negativeExample = 34.5
        val factorialExample = 4

        Log.d("TAG", telephoneExample.toTelephoneNumber())
        Log.d("TAG", negativeExample.toNegative().toString())
        Log.d("TAG", factorialExample.factorial().toString())
    }
}