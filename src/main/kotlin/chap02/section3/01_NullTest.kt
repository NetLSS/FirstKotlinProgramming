package chap02.section3

fun main() {
    var str1 : String = "Hello Kotlin"
    // str1 = null // Error!
    println("str1: $str1")

    var str2 : String? = "Hello Kotlin"
    str2 = null
    println("str2: $str2")


    // 세이프 콜(?.), non-null(!!.) 단정 기호 사용
    //println("str2 length: ${str2.length}") // 불가능

    println("str2 length: ${str2?.length}") // null이 아니면 length 멤버에 접근 , null 이면 null
    // println("str2 length: ${str2!!.length}") // null 아님을 단정. null 이어도 컴파일은 됨. but, 실행 중 NPE 발생


    // 조건문 활용 null 허용 변수 검사
    val len = if(str2 != null) str2.length else -1 // 조건문을 통해 null 검사 한 경우 컴파일 가능
    println("str2: $str2, length: ${len}")


    // 세이프 콜, 엘비스(?:) 연산자 함께 활용
    println("str2: $str2, length: ${str2?.length ?: -1}") // null 이면 -1 반환, null 아니면 str2?.length 반환


}