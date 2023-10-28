//Aggregate operation is an operation that is performed on a data structure, such as an array, as a whole rather than performed on an individual element.
fun main() {
    val number = listOf<Int>(1,5,6,2,154)
    println("sum of:${number.sum()}")
    println("averae of :${number.average()}")
    println("count of:${number.count()}")
    println("max. value of:${number.maxOrNull()}")
    println("min. value of:${number.minOrNull()}")
    println("the twice of list:${number.sumOf { it * 2 }}")
}