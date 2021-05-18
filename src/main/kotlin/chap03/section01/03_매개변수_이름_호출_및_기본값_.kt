package chap03.section01

fun main() {
    namedParam(y = 99)
    namedParam(x = 100, y = -100)
}

fun namedParam(x: Int = 100, y: Int, z: Int = 200) {
    println(x + y + z)
}

//399
//200