package chap03.section03

fun main() {
    var result = sum_user({x, y -> x + y}, 10, 20)
    println(result) // 30
}

fun sum_user(sum: (Int, Int) -> Int, a: Int, b: Int): Int{
    return sum(a, b)
}