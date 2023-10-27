//n Kotlin, listOf() is a function that is used to create an immutable list of elements.
//two types of list->>mutable-->>ead-only (listOf)
//fun main() {
//    val names = listOf<String>("keshav","rohit","arun","ankit")
//    //tis list is only read only
//    println(names[0])
//}
fun main() {
    //this mutable list can change and add
    val names= mutableListOf<String>("keshav","Rohit","arun","Speed")
    names.add("yart kholi")
    names.remove("Rohit")
    names.forEach { println(it) }
}