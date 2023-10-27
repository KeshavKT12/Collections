//Kotlin map is a collection that contains pairs of objects. Map holds the data in the form of pairs which consists of a key and a value
//mutable-->>immutable
// in map some keywords are diffrent to compare set and list.... in map remove , add and loop keywords are diffrent
//fun main() {
//    val name = mapOf<Int,String>(1 to "keshav",2 to "arun",3 to "adrash",4 to "speed",5 to "beast")
//    name.forEach { t, u ->
//        println("$t and $u")
//    }
//}

fun main() {
    val name = mutableMapOf<Int,String>(1 to "keshav",2 to "arun",3 to "adrash",4 to "speed",5 to "beast")
    name[6]="kai"
    name.remove(3)
    name.forEach { t, u ->
        println("$t and $u")
    }
}