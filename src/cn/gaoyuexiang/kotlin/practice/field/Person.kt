package cn.gaoyuexiang.kotlin.practice.field

class Person {
  var name: String = ""
    set(value) {
//      this code will call setter, so must use keyword field to set value
//      name = value
      field = value
    }
}