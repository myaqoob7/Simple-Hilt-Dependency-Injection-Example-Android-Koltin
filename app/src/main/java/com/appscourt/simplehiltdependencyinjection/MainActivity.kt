package com.appscourt.simplehiltdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var randomString: String
    @Inject
    lateinit var app:BaseApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvRandom: TextView = findViewById(R.id.tvRandom)
        tvRandom.text = randomString

        Log.i("DebugHilt","$app")

    }
}