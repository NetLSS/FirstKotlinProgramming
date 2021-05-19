package chap03.section03

fun main() {
    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })

    // 역시 마찬가지로 마지막 람다식은 소괄호 밖으로 뺄 수 있다.
    twoLambda({ a, b -> "First $a $b" }) {
        "Second $it"
    }
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("one", "two"))
    println(second("one"))
}

//First one two
//Second one
//First one two
//Second one