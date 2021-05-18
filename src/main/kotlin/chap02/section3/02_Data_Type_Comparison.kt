package chap02.section3

fun main() {
    val a: Int = 1
    // error
    //val b: Double = a //Type mismatch.
    //val c: Int = 1.1 //The floating-point literal does not conform to the expected type Int

    // Java 에서는 서로 다른 자료형 변수를 할당 시 작은 자료형에서 큰 자료형으로 자동 변환

    val b: Double = a.toDouble()

    val result = 1L + 3 // Long // 표현식 에서는 범위가 큰 자료형으로 자동 형변환

    val c: Byte = 10
    val d: Short = 55
    val e: Float = c + d.toFloat()
    val f: Char = e.toChar()

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)

    /*
    1
    1.0
    10
    55
    65.0
    A

     */

}