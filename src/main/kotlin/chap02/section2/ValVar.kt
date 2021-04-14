package chap02.section2

fun main(){
    val number = 10 // 자료형 지정 하지 않으면 알아서 추론됨
    var language = "Korean" // ctrl + shift + P (추론된 자료형 확인)
    val secondNumber: Int = 20
    language = "English" // var 키워드 선언 변수는 이후 변경 가능

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}