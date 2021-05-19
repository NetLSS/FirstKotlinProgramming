package chap03.section03

fun main() {
    // 인자와 반환 값이 있는 함수
    val res1 = funcParam(3, 2, ::sum3) // 일반 함수를 람다 처럼 전달하려면 :: 붙여서 사용
    println(res1)

    // 반환값 x
    hello(::text)

    // 일반 변수에 값처럼 할당
    val likeLambda = ::sum3
    println(likeLambda(6, 6))

    // 아래 3개는 동일한 결과
    hello(::text) // 함수 참조 기호 사용
    hello({a, b -> text(a, b)})
    hello{
        a, b -> text(a, b)
    }
}

fun sum3(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int)->Int): Int{
    return c(a,b)
}

fun hello(body: (String, String)->String):Unit{
    println(body("Hello", "World"))
}