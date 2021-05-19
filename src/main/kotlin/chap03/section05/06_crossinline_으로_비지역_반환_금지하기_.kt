package chap03.section05

fun main() {
    shortFunc5(3){
        println("First call $it")
        //return // 'return' is not allowed here
    }
}

inline fun shortFunc5(a: Int, crossinline out: (Int) -> Unit){
    println("Before calling out()")
    nestedFunc2{out(a)} // it may contain non-local returns. Add 'crossinline' modifier to parameter declaration 'out'
    // nestedFunc2 가 로컬이 아닌 반환을 포함할 수 있기 때문에 crossinline 으로 이를 방지해주는 것임.
    println("After calling out()")
}


// 이 함수로 인해 문맥이 달라서 return 을 사용하면 안될때 crossinline 을 사용하여 return 사용 금지를 명시한다.
fun nestedFunc2(body: ()->Unit){
    body()
}