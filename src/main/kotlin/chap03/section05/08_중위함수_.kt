package chap03.section05

fun main() {
    // 일반 표현법
    val _multi = 3.multiply(10)

    // 중위 표현법
    val multi = 3 multiply 10 // 30
    println(multi)
}

// Int 클래스를 확장해서 multiply() 함수를 새로 정의
infix fun Int.multiply(x:Int):Int{ // infix 로 선언 시 중위 함수
    println("$this multiply $x")
    return this * x
}


//3 multiply 10
//3 multiply 10
//30