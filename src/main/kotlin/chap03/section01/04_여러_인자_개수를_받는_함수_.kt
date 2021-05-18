package chap03.section01

fun main() {
    normalVarargs(1,2,3,4)
    normalVarargs(2,4,6,8,10,12,14)
}
fun normalVarargs(vararg counts: Int){
    for (num in counts){
        print("$num ")
    }
    println()
}

//1 2 3 4
//2 4 6 8 10 12 14