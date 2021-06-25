package chap08.section03

fun String.println():Unit{
    println(this)
}

fun main() {
    var deli = "Welcome to Kotlin"
    val sp = deli.split(" ") // List<String>
    println(sp)

    println("-------")

    "3+2=1".split("=","+","-","/","*").forEach { println(it)    }
}


/*
[Welcome, to, Kotlin]
-------
3
2
1

Process finished with exit code 0

 */