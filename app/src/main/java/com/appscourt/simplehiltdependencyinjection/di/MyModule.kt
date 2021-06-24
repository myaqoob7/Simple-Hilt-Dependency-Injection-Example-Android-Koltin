package com.appscourt.simplehiltdependencyinjection.di

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule {

    @ActivityScoped
    @Binds
    abstract fun bindSomeDependency(someInterface: SomeInterface): SomeInterface

    @ActivityScoped
    @Binds
    abstract fun bindSomeGson(gson: Gson):Gson
}