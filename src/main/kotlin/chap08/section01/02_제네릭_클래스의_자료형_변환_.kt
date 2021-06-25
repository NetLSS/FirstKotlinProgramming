package chap08.section01

open class Parent

class Child : Parent()

class Cup<T>


fun main() {
    val obj1: Parent = Child()
//    val obj2: Child = Parent()// error!

//    val obj3: Cup<Parent> = Cup<Child>() // error!
//    val obj4: Cup<Child> = Cup<Parent>()// error!

    val obj5 = Cup<Child>()
    val obj6: Cup<Child> = obj5
}
