package chap03.section01

fun main() {
    printSum(99, 1)
}

// 코틀린에서는 반환 값이 없을 경우 Unit 을 반환하며 이는 void와 다름 (void는 정말 아무것도 반환하지 않음)
// Unit 생략 가능

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
    // sum of 99 and 1 is 100
}