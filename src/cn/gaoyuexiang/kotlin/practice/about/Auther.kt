package cn.gaoyuexiang.kotlin.practice.about

class Auther(val name: String, val rate: String, var profession: String?, var company: String?) {
}

fun createChinese(name: String, profession: String? = null, company: String? = null): Auther {
    return Auther(name, "Chinese", profession, company)
}