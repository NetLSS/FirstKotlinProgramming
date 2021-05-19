package chap03.section03

fun main() {
    moreParam{a, b -> "Hello World! $a $b"} // 매개 변수가 2개 이상이므로 생략(it 사용) 불가
    moreParam{_, b -> "Hello world! $b"} // 사용 안하면 언더스코어로 대체 가능
}

fun moreParam(out: (String, String) -> String) {
    println(out("one", "two"))
}

//Hello World! one two
//Hello world! two