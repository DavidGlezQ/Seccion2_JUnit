package com.davidgllez.seccion2junit

/**
 * Created by davidgonzalez on 18/02/23
 */
class Assertions {
    private val user = User("David", 23)
    private var location = "US"

    fun setLocation(location: String) {
        this.location = location
    }

    fun getLuckyNumber(): Array<Int> {
        return arrayOf(21, 777)
    }

    fun getName(): String {
        return user.name
    }

    fun checkHuman(user: User): Boolean {
        return user.isHuman
    }

    fun checkHuman(user: User? = null): Boolean? {
        if (user == null) return null
        return user.isHuman
    }

    fun isAdult(user: User): Boolean {
        if (!user.isHuman) return true
        return if (location == "US") user.age >= 21
        else user.age >= 18
    }
}