fun main(args: Array<String>) {
    val a = 12
    val b = 7

    val max = if(a>b){
        println("a 선택")
        a // 마지막 라인이 전달되어 할당돰.
    }
    else{
        println("b 선택")
        b // 마지막 라인이 전달.
    }
    
    println(max)
}