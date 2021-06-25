package chap08.section03

fun main() {
    val number: Int = "123".toInt()

    try{
        "12w".toInt()
    } catch (e: NumberFormatException){
        println(e.printStackTrace())
    }

    "12w".toIntOrNull() // 또는 이렇게 사용
}

/*
java.lang.NumberFormatException: For input string: "12w"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at chap08.section03._04_문자열을_정수로_Kt.main(04_문자열을_정수로_.kt:7)
	at chap08.section03._04_문자열을_정수로_Kt.main(04_문자열을_정수로_.kt)
kotlin.Unit

Process finished with exit code 0
 */