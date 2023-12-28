package com.gredi.manual_dependency_injection

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityViewModel : ViewModel() {
    var number = 0

    fun getRandomNumber() {
        number = Random.nextInt(100)
    }
}