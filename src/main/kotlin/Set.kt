//Kotlin set is an unordered collection of items.
//Kotlin mutable or immutable sets do not allow to have duplicate elements.
//mutable set-->>Immutable set
//fun main() {
//    val name= setOf<String>("aaaaa","bbbbb","cccc","aaaaa")
//    //let see the output aaaaa var... is duplicate so is not print
//    name.forEach { println(it) }
//}

fun main() {
    val name= mutableSetOf<String>("keshav","keshav","arun","speed")
    name.add("mrbeast")
    name.remove("arun")
    name.forEach { println(it) }
}