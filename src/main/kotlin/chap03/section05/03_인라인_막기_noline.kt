package chap03.section05

fun main() {

    shortFunc2(3) { println("First call: $it") }
}

inline fun shortFunc2(a: Int, noinline out: (Int) -> Unit) {
    println("before calling out()")
    out(a)
    println("After calling out()")
}

//before calling out()
//First call: 3
//After calling out()