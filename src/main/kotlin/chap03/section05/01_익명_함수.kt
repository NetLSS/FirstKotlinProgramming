package chap03.section05

fun main() {
    val add: (Int, Int) -> Int = fun(x, y) = x + y
    val add2 = fun(x: Int, y: Int) = x + y
    // 람다 말고 익명 함수 사용하는이유 : return, break, continue 등 제어문 사용하기가 람다보다 용이하여.
}
