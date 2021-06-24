package com.appscourt.simplehiltdependencyinjection.di

import javax.inject.Inject

class SomeInterfaceImp @Inject constructor(private val someDependency:String): SomeInterface {
    override fun getAThing(): String {
        return "A Thing $someDependency"
    }
}