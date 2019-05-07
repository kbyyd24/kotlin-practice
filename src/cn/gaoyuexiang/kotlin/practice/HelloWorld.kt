package cn.gaoyuexiang.kotlin.practice

import cn.gaoyuexiang.kotlin.practice.Color.GREEN
import cn.gaoyuexiang.kotlin.practice.extensions.lastChar

fun main() {
    println("Hello, Kotlin.")
    val a = 4
    println(max(a))
    println(level(GREEN))
    println("Kotlin".lastChar())
}