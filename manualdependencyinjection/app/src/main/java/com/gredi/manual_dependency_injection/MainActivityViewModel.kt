package com.gredi.manual_dependency_injection

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var number = 0

    fun getRandomNumber() {
        number = AppModule.provideRepository().getData()
    }
}