package chap08.section02

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.65),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99)
    )
    products.sortBy { it.price }
    products.forEach { println(it) }

    val product2 = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone A", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 633.55),
        Product("keyboard", 125.99),
        Product("Smart Phone B", 1500.99),
        Product("Mouse", 512.99)
    )

    // Comparator 사용 예시
    product2.sortWith(Comparator<Product> { p1, p2 ->
        when {
            p1.price > p2.price -> 1
            p1.price == p2.price -> 0
            else -> -1
        }
    })
    // 이름을 먼저 정렬한뒤 가격으로 정렬;
    product2.sortWith(compareBy({ it.name }, { it.price }))
    println("------------------------")
    product2.forEach { println("$it") }
    println("------------------------")
    println(product2.minByOrNull { it.price })
    println(product2.maxByOrNull { it.price })
}

/*
Product(name=Keyboard, price=125.99)
Product(name=Drone, price=240.0)
Product(name=Mouse, price=333.65)
Product(name=Tablet, price=512.99)
Product(name=Snow Ball, price=870.0)
Product(name=Smart Phone, price=999.0)
Product(name=Monitor, price=1500.99)
------------------------
Product(name=Drone, price=240.0)
Product(name=Mouse, price=512.99)
Product(name=Mouse, price=633.55)
Product(name=Smart Phone A, price=999.0)
Product(name=Smart Phone B, price=1500.99)
Product(name=Snow Ball, price=870.0)
Product(name=keyboard, price=125.99)

Process finished with exit code 0

 */