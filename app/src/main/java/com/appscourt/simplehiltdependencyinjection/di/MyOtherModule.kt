package com.appscourt.simplehiltdependencyinjection.di


import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class MyOtherModule {

    @Singleton
    @Provides
    fun provideSomeString():String{
        return "Some String"
    }

    @Singleton
    @Provides
     fun provideSomeDependency(someString: String): SomeInterface {
         return SomeInterfaceImp(someString)
     }

    @Singleton
    @Provides
    fun provideSomeGson():Gson{
        return Gson()
    }
}