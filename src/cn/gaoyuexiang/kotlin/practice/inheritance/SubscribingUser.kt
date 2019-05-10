package cn.gaoyuexiang.kotlin.practice.inheritance

class SubscribingUser(username: String, override val email: String): User(username), HasEmail {
}