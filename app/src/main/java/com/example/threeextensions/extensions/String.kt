package com.example.threeextensions.extensions

// десять цифр в телефонный номер

fun String.toTelephoneNumber(): String {
    val regex = """(\d)(\d{3})(\d{3})(\d{2})(\d{2})""".toRegex()
    return regex.replace(this, "+$1 $2 $3-$4-$5")
}