package com.juanicoding.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // delay for 3 seconds to go to the next page
    val handler = Handler()
        handler.postDelayed({

            // command to go to the next page
            btn_next.setOnClickListener {
                val mainAcitity2 = Intent(this@MainActivity, Main2Activity::class.java)
                startActivity(mainAcitity2)
            }
        }, 3000)
    }
}
