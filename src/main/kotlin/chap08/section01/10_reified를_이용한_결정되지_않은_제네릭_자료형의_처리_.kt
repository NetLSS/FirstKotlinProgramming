package chap08.section01

fun main() {
    val result = getType<Float>(10)
    print("result = $result")
}

inline fun <reified T> getType(value: Int): T {
    println(T::class) // 실행 시간에 삭제되지 않고 사용 가능
    println(T::class.java) // 자바와 동일한 클래스 사용하려면 이렇게.

    return when (T::class) {
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }

}