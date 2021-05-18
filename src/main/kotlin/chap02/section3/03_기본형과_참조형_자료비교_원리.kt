package chap02.section3

fun main() {
    val a: Int = 128
    val b: Int = 128 // 둘 다 기본형으로 저장됨

    println(a==b) // true
    println(a===b) // true

    val c: Int = 128
    val d: Int? = 128 // 참조형으로 저장됨

    println(c==d) // true
    println(c===d) // false
}