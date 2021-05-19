package chap03.section05
/*
익명 함수를 종료하기 위해 return 을 사용할 수 있고
특정 반환 값 없이 그저 return 만 사용해야한다.
인라인 함수에서 사용한 람다식에서는 return 을 사용할 수 있다.
 */
fun main() {
    shortFunc4(3){
        println("First Call")
        return@shortFunc4
    }
    println("main exit") // 정상 실행 됨
}

inline fun shortFunc4(a: Int, out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

//Before calling out()
//First Call
//After calling out()
//main exit
