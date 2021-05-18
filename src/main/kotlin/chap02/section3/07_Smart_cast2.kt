package chap02.section3

fun main() {
    val x: Any // 어떠한 자료형이라도 넣을 수 있는 Any형
    x = "Hello"
    if (x is String){
        println(x.length) // 자동 적으로 Stirng 으로 스마트 캐스트
    }

    val a: String = "abc"
    val b: String = a as String
    val c: String? = a as? String // null 이 아니면 스마트 변환

    println(a)
    println(b)
    println(c)

//
//    5
//    abc
//    abc
//    abc
}