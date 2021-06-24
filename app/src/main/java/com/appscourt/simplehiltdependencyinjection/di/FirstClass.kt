package com.appscourt.simplehiltdependencyinjection.di

import javax.inject.Inject

class FirstClass @Inject constructor(private val secondClass: SecondClass) {

    fun doFirstThing():String{
        return "Look I did first thing!"
    }

    fun doSecondThing():String{
        return secondClass.doSecondThing()
    }
}