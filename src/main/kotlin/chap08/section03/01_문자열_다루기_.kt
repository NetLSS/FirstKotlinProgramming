package chap08.section03

fun main() {
    var s = "abcdef"
    println(s.substring(0..2)) // abc

    s = s.substring(0..1) + "x" + s.substring(3 until s.length)
    println(s) // abxdef

    var s1 = "Hello Kotlin"
    var s2 = "Hello KOTLIN"

    // 같으면 0, s1<s2 이면 양수, s1>s2 이면 음수
    println(s1.compareTo(s2)) // 32
    println(s1.compareTo(s2, true) ) // 대소 문자 무시 //0

}