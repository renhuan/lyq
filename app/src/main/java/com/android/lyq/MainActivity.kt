package com.android.lyq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lyqStickView.addHead(View.inflate(this, R.layout.head, null))
        lyqStickView.setAdapter(
            supportFragmentManager,
            arrayListOf("录播中心", "直播中心"),
            arrayListOf(BlankFragment(), BlankFragment())
        )
    }
}