package com.example.iwan.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var powerOffBtn:Button? = null
    private var rebootBtn:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.powerOffBtn = findViewById(R.id.powerOffBtn)
        this.rebootBtn = findViewById(R.id.rebootBtn)

        /*点击了关机按钮*/
        this.powerOffBtn!!.setOnClickListener {
            Runtime.getRuntime().exec(arrayOf("su", "-c", "reboot -p"))
        }

        /*点击了重启按钮*/
        this.rebootBtn!!.setOnClickListener {
            Runtime.getRuntime().exec(arrayOf("su","-c","reboot "))

        }
    }
}
