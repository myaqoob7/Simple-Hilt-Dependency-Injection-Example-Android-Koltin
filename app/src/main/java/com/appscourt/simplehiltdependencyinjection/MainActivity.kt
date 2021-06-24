package com.appscourt.simplehiltdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.appscourt.simplehiltdependencyinjection.di.FirstClass
import com.appscourt.simplehiltdependencyinjection.di.SomeClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // field injection
    @Inject
    lateinit var someClass: SomeClass

    // constructor injection
    @Inject
    lateinit var firstClass: FirstClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("HiltDebug",someClass.doAThing())
        Log.i("HiltDebug",firstClass.doSecondThing())

    }
}