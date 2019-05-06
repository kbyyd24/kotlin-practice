@file:JvmName("CommonUtil")

fun max(a: Int, b: Int = Int.MIN_VALUE) = if (a > b) a else b

fun level(color: Color) = when (color) {
    Color.RED -> "error"
    Color.ORANGE -> "warn"
    Color.BLUE, Color.GREEN -> "info"
}