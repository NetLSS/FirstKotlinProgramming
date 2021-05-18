package chap02.section3

fun main() {
    val a: Int = 128 // 주의! -128~127 범위로 값을 주면 참조형 주소를 캐시에 저장된 주소를 가리키게되어 아래가 모두 true
    val b = a

    println(a===b) // true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c==d) // true : 값 의 내용 동일
    println(c===d) // false : 값의 내용 동일하지만 주소 다름
    println(c===e) // true : 값, 주소 일치
}