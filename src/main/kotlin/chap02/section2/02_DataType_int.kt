package chap02.section2

fun main(num07: Int, exp02: Long, ubyte: UByte ){
    val num05 = 127 // Int
    val num06 = -32768 // Int
    val num07 = 2147483647 // Int
    val num08 = 9223372036854775807 // Long

    val exp01 = 123
    val exp02 = 123L // Long
    val exp03 = 0x0F // Int 16진수
    val exp04 = 0b00001011 // Int 2진수
    // 8진수는 지원하지 않음

    // Byte 나 Short 자료형 사용하기
    val exp08: Byte = 127 // Byte로 명시하였기 때문에 Byte 형식으로 생성됨
    val exp09 = 32767 // Shot 범위를 갖고 있는 수여도 명시하지 않으면 Int로 간주
    val exp10: Short = 32767 // 명시적 Short 지정하였기에 Short로 생성됨

    // 2배 많은 양수 사용이 가능한 unsigned 변수 (1.3ver 실험적)
    val uint: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    val uint2 = 153u
    // val uint3: UInt = 153 // 불가능 (식별자 명시 안하면 할당 불가)

    // 언더 스코어로 자릿값 구분하기
    val number = 1_000_000
    val cardNum = 1234_1234_1234_1234L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010
}