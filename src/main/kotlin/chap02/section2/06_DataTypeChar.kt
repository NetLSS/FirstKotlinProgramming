package chap02.section2

fun main() {
    var ch = 'c' // Char로 추론됨
    val ch2: Char // 선언 시 명시
    // Char 는 2Byte

    ch = 'A'
    println(ch + 1) // B

    // 에러!
    // val ch3: Char = 65 // 선언 시 에는 문자 값으로 선언해야함

    val asciiCode: Int = 65
    val chFromCode: Char = asciiCode.toChar()
    println(chFromCode) // A

    val ch3 = '\uD55C' // 유니코드 표기법 으로 '한' 할당
    println(ch3) // 한
}