package com.cis.basicfantasyapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    fun main(args :Array<String>) {
        var characterName:String = readLine()!!
    }
}
