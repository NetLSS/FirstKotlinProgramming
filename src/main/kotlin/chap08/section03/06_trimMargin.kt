package chap08.section03

fun main() {
    val text ="""
            |Tell me and I forget.
           |Teach me and I remember.
          |Involve me and I learn.
         |(Benjamin Franklin)
    """

    println(text)
    /*

            |Tell me and I forget.
           |Teach me and I remember.
          |Involve me and I learn.
         |(Benjamin Franklin)

     */
    println(text.trimMargin())
    /*
    Tell me and I forget.
    Teach me and I remember.
    Involve me and I learn.
    (Benjamin Franklin)
     */
    println(text.trimIndent())
    /*
       |Tell me and I forget.
      |Teach me and I remember.
     |Involve me and I learn.
    |(Benjamin Franklin)
     */
}