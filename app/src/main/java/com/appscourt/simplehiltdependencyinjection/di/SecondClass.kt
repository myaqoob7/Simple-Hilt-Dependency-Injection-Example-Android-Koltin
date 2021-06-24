package com.appscourt.simplehiltdependencyinjection.di

import javax.inject.Inject

class SecondClass @Inject constructor() {

    fun doSecondThing():String{
        return "Look I did second thing!"
    }
}