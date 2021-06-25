package chap08.section01

import sun.security.provider.ConfigFile

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int) : Animal(50)
class Spider(val poison: Boolean) : Animal(1)

class AnimalBox<out T : Animal>(val element: T) { // 주 생성자서는 val만 허용 var 사용시 private 필요.
    fun getAnimal(): T = element // out 은 반환 자료형에만 사용가능
//    fun set(new: T){ // T는 in 위치에 사용 불가
//        element = new
//    }
}

fun main() {
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("a1.size = ${a1.size}")

    val c2: AnimalBox<Animal> = AnimalBox<Cat>(Cat(10)) // 공변성 - 고양이는 동물의 하위 자료형
    println("c2.element.size = ${c2.element.size}")

//    val c3: AnimalBox<Cat> = AnimalBox<Animal>(10) // 오류! 반대의 경우는 인스턴스화 하지 않음
//    val c4: AnimalBox<Any> = AnimalBox<Int>(10) // 오류! 자료형을 제한하여 Animal과 하위 클래스 이외에는 사용 불가
}