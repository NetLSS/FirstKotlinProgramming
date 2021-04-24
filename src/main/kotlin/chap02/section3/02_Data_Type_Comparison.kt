package chap02.section3

fun main() {
    val a: Int = 1
    // error
    //val b: Double = a //Type mismatch.
    //val c: Int = 1.1 //The floating-point literal does not conform to the expected type Int

    val b: Double = a.toDouble()

    val result = 1L + 3 // Long // 표현식 에서는 범위가 큰 자료형으로 자동 형변환
}