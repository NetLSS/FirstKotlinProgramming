package chap03.section05

fun main() {
    println("Hello World!".getLongString("Kotlin"))
}

// 길이가 더 긴 녀석을 반환
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target