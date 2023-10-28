//In Kotlin, plus ( + ) and minus ( - ) operators are defined for collections. They take a collection as the first operand; the second operand can be either an element or another collection.
fun main(){
    val numbers= mutableListOf<String>("one","two","three","four")
    val pluslst = numbers + "five"
    println(pluslst)
    val minusList  = numbers - mutableListOf("three")
    println(minusList)

}