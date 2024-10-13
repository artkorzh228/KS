package org.example

fun main() {
    var number: Int = 6
    var numberMultiply = 1
    for (i in 0..9) {
        println("Произведение чисел $number и $numberMultiply равно: ${number * numberMultiply}")
        numberMultiply++
    }

}