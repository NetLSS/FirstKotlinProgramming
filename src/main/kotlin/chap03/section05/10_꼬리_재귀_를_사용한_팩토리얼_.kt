package chap03.section05

/*
코틀린에서 tailrec 키워드가 있습니다. 이 키워드가 붙은 함수가 꼬리재귀 함수라면 코드가 컴파일될 때 루프를 사용한 코드로 변경됩니다.
 */

fun main() {
    val number = 4
    println("Factorial: $number -> ${factorial_tailrec(number)}")
}

tailrec fun factorial_tailrec(n: Int, run: Int = 1): Long{
    return if (n == 1) run.toLong() else factorial_tailrec(n-1, run * n) // 자기 자신만 반복해서 호출
}

//Factorial: 4 -> 24

/*
factorial(5)
factorial(5-1, 1*5)
factorial(4-1, 1*5*4)
factorial(3-1, 1*5*4*3)
factorial(2-1, 1*5*4*3*2)
-> return 1*5*4*3*2
 */