//he Kotlin standard library provides extension functions for grouping collection elements. The basic function groupBy()
fun main(){
    val numbers = listOf<String>("one","two","three","four","five","six","seven")
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
}