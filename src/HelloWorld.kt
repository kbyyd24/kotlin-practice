import Color.*

fun main() {
    println("Hello, Kotlin.")
    val a = 4
    val b: Int = 3
    println(max(a, b))
    print(level(GREEN))
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun level(color: Color) = when (color) {
    RED -> "error"
    ORANGE -> "warn"
    BLUE, GREEN -> "info"
}