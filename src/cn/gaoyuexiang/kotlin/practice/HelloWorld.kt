package cn.gaoyuexiang.kotlin.practice

import cn.gaoyuexiang.kotlin.practice.Color.GREEN
import cn.gaoyuexiang.kotlin.practice.about.Auther
import cn.gaoyuexiang.kotlin.practice.about.createChinese
import cn.gaoyuexiang.kotlin.practice.extensions.lastChar

fun main() {
    println("Hello, Kotlin.")
    val a = 4
    println(max(a))
    println(level(GREEN))
    println("Kotlin".lastChar())
    objectOrientation()
}

fun objectOrientation() {
    val me = Auther("Yuexiang", "Chinese", "Programmer", "ThoughtWorks")
    println("I'm ${me.name}, a ${me.rate}, a ${me.profession} working for ${me.company}.")

    val anotherMe = createChinese("Yuexiang")
    println("I'm ${anotherMe.name}, a ${anotherMe.rate}, a ${anotherMe.profession} working for ${anotherMe.company}.")
}