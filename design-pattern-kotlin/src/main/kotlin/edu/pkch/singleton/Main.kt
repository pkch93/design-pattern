package edu.pkch.singleton

interface Hello {
    fun hello(countryCode: Int)
}

object KoreaHello: Hello {
    override fun hello(countryCode: Int) {
        if (countryCode == 82) {
            println("안녕하세요")
        }
    }
}

object EnglishHello: Hello {
    override fun hello(countryCode: Int) {
        if (countryCode == 1) {
            println("Hello")
        }
    }
}

class HelloManager private constructor(
    private val hellos: List<Hello>
) {
    fun hello(countryCode: Int) {
        hellos.forEach { it.hello(countryCode) }
    }

    companion object: SingletonHolder<HelloManager, List<Hello>>(::HelloManager)
}

fun main() {
    val helloManager: HelloManager = HelloManager.getInstance(listOf(KoreaHello, EnglishHello))
    helloManager.hello(82)
}