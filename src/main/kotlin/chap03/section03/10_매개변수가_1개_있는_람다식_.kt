package chap03.section03

fun main() {
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } // 소괄호 생략 가능
    oneParam { "Hello World! $it" } // it 으로 대체 가능
}

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

//Hello World! OneParam
//Hello World! OneParam
//Hello World! OneParam