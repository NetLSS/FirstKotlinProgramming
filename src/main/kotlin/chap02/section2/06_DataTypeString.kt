package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 == str2: ${str1 == str2}")
    println("str1 == str3: ${str1 == str3}") // heap 의 String pool 에 있는 "Hello"를 동일하게 참조하기 때문에 true
}