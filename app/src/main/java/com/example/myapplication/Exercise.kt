package com.example.myapplication

import kotlin.reflect.typeOf
fun main(){
    //კოდში არგავითვალისწინე მოსალოდნელი ექსეფშენები რადგან ვიფიქრე რომ პირველი დავალებისთვის ზედმეტად გავართულებდი

    while (true) {


        println("დაწყება")
        println("შეიყვანეთ X ცვლადის მნიშვნელობა")
        var X = readln().toDouble()
        println("შეიყვანეთ Y ცვლადის მნიშვნელობა")
        var Y = readln().toDouble()
        var Z = X + Y
        println("X და Y ჯამი არის:${Z}")
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        var answer = readln()
        if (answer.toUpperCase() == "N") {
            break
        }
    }
    println("დასასრული")
}