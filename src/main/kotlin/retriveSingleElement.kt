fun main() {
    val numbers = listOf<String>("one", "two", "three", "four", "five")
    println(numbers.elementAt(2))
    println(numbers.first())
    println(numbers.last())
    println("\n")
    //you can access the elemnt user ecpreession in single element retrive
    println(numbers.first { it.length > 3 })
    println(numbers.last{it.startsWith("f")})
    println("\n")
    // random function are also provide by koltin this is normal preint random elements in the list
    println(numbers.random())
    println("\n")
    // you also check your list is empty or not
    println(numbers.isEmpty())
}