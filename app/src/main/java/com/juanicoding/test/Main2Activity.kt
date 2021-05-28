package com.juanicoding.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /* when the user clicks the back button it will,
         back to first page (MainActivity.kt)
         */
        btn_back.setOnClickListener {
            val backToMain = Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(backToMain)
        }
    }
}
