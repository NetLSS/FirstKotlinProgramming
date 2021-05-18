package chap02.section4

fun main() {
    var num1 = 12
    var num2 = 25

    num1 = num1 xor num2; println("${Integer.toBinaryString(num1)}")
    num2 = num1 xor num2; println("${Integer.toBinaryString(num2)}")
    num1 = num1 xor num2; println("${Integer.toBinaryString(num1)}")
//    10101
//    1100
//    11001

    println(num1)
    println(num2)

//    25
//    12
}