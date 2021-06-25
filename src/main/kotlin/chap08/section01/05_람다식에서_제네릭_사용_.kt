package chap08.section01

// error
//fun <T> add(a: T, b: T) {
//    return a + b
//}

typealias arithmetic<T> = (T, T) -> T

fun <T> add(a: T, b: T, op: arithmetic<T>): T {
    return op(a, b)
}

fun main() {
    val result = add(2, 3) { a, b -> a + b }
    println(result)
}

// 5