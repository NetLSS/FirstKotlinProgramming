package chap03.section05

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

fun main() {
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial: $number -> $result")
}

// 총 4번 호출 되므로 factorial 함수가 차지하는 메모리의 4배의 스택 메모리가 사용됨
fun factorial(n: Int): Long{
    return if (n == 1) n.toLong() else n * factorial(n-1)
}

//Factorial: 4 -> 24
