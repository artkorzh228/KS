package org.example

fun main(){
    var firstMove = "E2"
    var secondMove = "E4"
    val numberOfMove = 1
    println("On $numberOfMove. move dark chess going: $firstMove -> $secondMove")
    firstMove = "D2"
    secondMove = "D${2 + 1}"
    println("On $numberOfMove. move white chess going: $firstMove -> $secondMove")



}