package chap08.section03

import java.util.*

fun main() {
    // books
    val booksName = arrayOf("java","c","c++", "kotlin", "c#", "html")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f

    val scanner  = Scanner(System.`in`)

    println("** 상수의 서점에 오신 걸 환영합니다. **")
    do{
        println(booksName.contentToString())
        println("어떤 책을 원하시나요?")
        print("답변: ")

        // \n을 포함하는 한줄을 읽고 \n을 버리고 남은 문자열 반환 및 할당
        val book = scanner.nextLine()

        if(booksName.contains(book.toLowerCase())){
            println("선택하신 책은 ${book}입니다. 가격은 \$200")
            println("학생과 선생님인 경우에 할인을 적용하고 있습니다.\n" +
                    "당신의 직업은 무엇인가요?(student, teacher, etx)?")
            print("답변: ")
            val occupation = scanner.nextLine()

            when(occupation.toLowerCase()){
                "student" -> calculatePrice(price, studentDiscount)
                "teacher" -> calculatePrice(price, teacherDiscount)
                else -> println("할인을 적용할 수 없습니다." +
                        "\n최종 가격은 \$200 입니다.")
            }

        }else if(book=="exit" || book=="q"){
            break
        }else{
            println("죄송합니다. ${book}의 재고가 없습니다.")
        }
    } while (true)
}

private fun calculatePrice(orig: Float, x: Float){
    val result = orig - (orig * x)
    println("최종 가격은 \$$result 입니다.")
}

/*
** 상수의 서점에 오신 걸 환영합니다. **
[java, c, c++, kotlin, c#, html]
어떤 책을 원하시나요?
답변: kotlin
선택하신 책은 kotlin입니다. 가격은 $200
학생과 선생님인 경우에 할인을 적용하고 있습니다.
당신의 직업은 무엇인가요?(student, teacher, etx)?
답변: student
최종 가격은 $150.0 입니다.
[java, c, c++, kotlin, c#, html]
어떤 책을 원하시나요?
답변: exit

Process finished with exit code 0

 */