// retrieving parts of a collection. These functions provide a variety of ways to select elements for the result collection: listing their positions explicitly, specifying the result size, and others.
fun main() {
    val numbers = listOf<String>("one","two","three","four","five","six","seven")
    println(numbers.slice(0..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3,5,0)))
    println("\n")
    //take amd drop function
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(5))
    println("\n")
    //some performe experssion in list elments use this functions
    println(numbers.takeWhile { !it.startsWith("f") })
    println(numbers.takeLastWhile { it != "three" })
    println(numbers.dropWhile { it.length==3 })
}