package chap02.section2

// 형식화된 다중 문자열
fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num) // num의 값은 $num
        1,000 $
    """.trimIndent()
    println(formattedString)

    // 출력
    /*
    var a = 6
    var b = "Kotlin"
    println(a + num) // num의 값은 10
    1,000 $
     */
}