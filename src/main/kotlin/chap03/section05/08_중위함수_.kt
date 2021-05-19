package chap03.section05

fun main() {
    val multi = 3 multiply 10 // 30
    println(multi)
}

infix fun Int.multiply(x:Int):Int{
    println("$this multiply $x")
    return this * x
}
//
//3 multiply 10
//30