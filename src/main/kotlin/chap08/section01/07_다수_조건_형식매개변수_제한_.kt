package chap08.section01

interface InterfaceA
interface InterfaceB

class Handler01 : InterfaceA, InterfaceB
class Handler02 : InterfaceA

class ClassAlpha<T> where T : InterfaceA, T : InterfaceB

fun main() {
    val obj1 = ClassAlpha<Handler01>()
//    val obj2 = ClassAlpha<Handler02>() //error
}

fun <T> myMax(a: T, b: T): T where T : Number, T : Comparable<T> {
    return if (a > b) a else b
}