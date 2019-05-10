package cn.gaoyuexiang.kotlin.practice.inheritance

interface HasEmail {
  val email: String
  val nickname: String
    get() = email.substringBefore('@')
}