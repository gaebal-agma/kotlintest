package com.test.composetest

fun main(){
    fun add(vararg numbers: Int): Int {
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return sum
    }
    fun add2(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    val sum = add(1, 2, 3, 4, 5)
    println(sum) // 15 출력
}