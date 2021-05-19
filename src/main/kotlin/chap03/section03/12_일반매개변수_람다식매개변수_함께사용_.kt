package chap03.section03

fun main() {
    // 인자와 함께 람다식 사용
    withArgs("Arg1", "Arg2", {a, b -> "Hello World! $a $b"})

    // "마지막 인자가 람다식"인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1", "Arg2"){
        a, b -> "Hello World! $a $b"
    }

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}