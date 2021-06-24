package com.appscourt.simplehiltdependencyinjection.di

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


// change different scope and see the results
@ActivityScoped
class SomeClass @Inject constructor() {

    fun doAThing():String{
        return "Look I did a thing!"
    }
}