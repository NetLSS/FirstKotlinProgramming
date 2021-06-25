package chap08.section01

class GenericNull<T> { // 형식 매개변수는 기본적으로 널이 허용됨 (허용 하지 않으려면 T:Any 사용)
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() // non-null
    obj.EqualityFunc("Hello", "World") // null 불가

    val obj2 = GenericNull<Int?>() // nullable
    obj2.EqualityFunc(null, 10) // null 가능
}

/*
false
null

Process finished with exit code 0

 */