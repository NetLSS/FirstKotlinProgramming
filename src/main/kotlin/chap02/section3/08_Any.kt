package chap02.section3

fun main() {
    var a: Any = 1
    a = 20L
    println("a: $a type ${a.javaClass}")
    //a: 20 type long

    checkArg("Hello")
    checkArg(5)
//    x is String: Hello
//    x is Int: 5
}

fun checkArg(x: Any){
    if (x is String){
        println("x is String: $x")
    }
    else if (x is Int){
        println("x is Int: $x")
    }
}