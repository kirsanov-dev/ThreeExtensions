package com.example.threeextensions.extensions

// отрицательное число из положительного

fun Double.toNegative(): Double {
    return if (this > 0) {
        this * -1.0
    } else {
        this
    }
}