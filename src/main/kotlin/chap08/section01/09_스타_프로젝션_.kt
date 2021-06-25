package chap08.section01

class InOutTest<in T, out U>(t: T, u: U) {
    //val propT: T = t // out 위치에 사용 불가능
    val propU: U = u

    //    fun func1(u:U) // in 위치에 사용 불가능
    fun func2(t: T) {
        print(t)
    }
}

fun starTestFunc(v: InOutTest<*, *>) {
//    v.func2(1) // error! Nothing 으로 인자를 처리
    print(v.propU)

}