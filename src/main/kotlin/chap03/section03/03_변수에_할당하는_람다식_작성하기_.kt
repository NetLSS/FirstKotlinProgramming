package chap03.section03

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x * y} // 람다 식을 변수에 할당
    result = multi(10, 20)
    println(result) // 200

    val multi2 = {x: Int, y: Int ->
        println("x * y")
        x * y // 여러줄 일 경우 마지막 표현식이 반환 됨
    }

    // 아래 3개는 모두 같은 람다식 표현
    val multi3: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    val multi4 = {x: Int, y: Int -> x * y}
    val multi5: (Int, Int) -> Int = {x, y -> x * y}

    // 반환 자료형이 없는 경우
    val greet: () -> Unit = {println("Hello world!")}
    val greet2 = {println("Hello world!")}

    // 매개 변수가 1개인 경우
    val square: (Int) -> Int = {x -> x * x}
    val square2 = {x: Int -> x * x}

    // 람다 식 안에 람다식
    val nestedLambda: () -> () -> Unit = {{println("nested")}}
    val nestedLambda2 = {{println("nested")}}
}