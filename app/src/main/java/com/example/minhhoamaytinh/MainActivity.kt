package com.example.minhhoamaytinh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncong.setOnClickListener {
            var kq: Double = (so1.text.toString()).toDouble() + so2.text.toString().toDouble()
            tvketqua.text = kq.toString()
        }
        btntru.setOnClickListener {
            var kq: Double = (so1.text.toString()).toDouble() - so2.text.toString().toDouble()
            tvketqua.text = kq.toString()
        }
    }
}