package chap03.section05

fun main() {
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("Second call: $it") }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

//Before calling out()
//First call: 3
//After calling out()
//Before calling out()
//Second call: 5
//After calling out()