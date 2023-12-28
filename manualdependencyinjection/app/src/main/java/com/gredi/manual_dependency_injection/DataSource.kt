package com.gredi.manual_dependency_injection

import kotlin.random.Random

class DataSource {
    val randomNumber = Random.nextInt(100)
    fun getData(): Int {
        return randomNumber
    }

}