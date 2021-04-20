package chap02.section2

fun main() {
    println("Byte min: " + Byte.MAX_VALUE + " max: " + Byte.MAX_VALUE)
    println("Short min: " + Short.MAX_VALUE + " max: " + Short.MAX_VALUE)
    println("Int min: " + Int.MAX_VALUE + " max: " + Int.MAX_VALUE)
    println("Long min: " + Long.MAX_VALUE + " max: " + Long.MAX_VALUE)
    println("Float min: " + Float.MAX_VALUE + " max: " + Float.MAX_VALUE)
    println("Double min: " + Double.MAX_VALUE + " max: " + Double.MAX_VALUE)

    /*
    Byte min: 127 max: 127
    Short min: 32767 max: 32767
    Int min: 2147483647 max: 2147483647
    Long min: 9223372036854775807 max: 9223372036854775807
    Float min: 3.4028235E38 max: 3.4028235E38
    Double min: 1.7976931348623157E308 max: 1.7976931348623157E308
     */

    // 범위가 넘는 값 할당시 에러
    // 비트 연산의 경우는 에러 발생 x but, 의도 하지 않은 값 만들어 질 가능성 있음
}