package chap03.section03

fun main() {
    // 매개 변수가 없는 람다식
    noParam({"Hello World!"})
    noParam { "Hello World!" } // 소괄호 생략가능
}

fun noParam(out: () -> String) = println(out())

//Hello World!
//Hello World!