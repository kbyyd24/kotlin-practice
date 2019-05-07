package cn.gaoyuexiang.kotlin.practice.about

class Auther(val name: String, val rate: String, var profession: String?, var company: String?) {

  fun introduce(): String {
    return "I'm $name, a $rate${if (profession != null) ", a $profession" else ""}${if (company != null) " working for $company" else ""}."
  }
}

fun createChinese(name: String, profession: String? = null, company: String? = null): Auther {
  return Auther(name, "Chinese", profession, company)
}