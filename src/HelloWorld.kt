import Color.*

fun main() {
    println("Hello, Kotlin.")
    val a = 4
    println(max(a))
    print(level(GREEN))
}

fun max(a: Int, b: Int = Int.MIN_VALUE) = if (a > b) a else b

fun level(color: Color) = when (color) {
    RED -> "error"
    ORANGE -> "warn"
    BLUE, GREEN -> "info"
}