package com.example.threeextensions.extensions

// факториал

fun Int.factorial():Long {
    var factorial: Long = 1
    for (i in 1..this) {
        factorial *= i.toLong()
    }
    return factorial
}