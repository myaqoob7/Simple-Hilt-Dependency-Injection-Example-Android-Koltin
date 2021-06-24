package com.appscourt.simplehiltdependencyinjection

import androidx.fragment.app.Fragment
import com.appscourt.simplehiltdependencyinjection.di.SomeClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyFragment:Fragment() {
    @Inject
    lateinit var someClass: SomeClass
}