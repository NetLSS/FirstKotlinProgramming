package chap03.section03

fun main() {
    val result = callByValue(lambda()) // 람다식을 함수로 호출 // 즉시 lambda()를 실행 후 값으로 전달
    println(result)
}

fun callByValue(b: Boolean): Boolean{ // 일반 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true // 마지막 문장이 반환 값으로 사용됨
}

//lambda function
//callByValue function
//true