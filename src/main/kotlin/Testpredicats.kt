//Returns true if at least one element matches the predicate
//any(),none(),all()
fun main(){
    val numbers= listOf<String>("one","two","three","four")
    println(numbers.any{it.endsWith("e")})
    println(numbers.none{it.endsWith("w")})
    println(numbers.all{it.length>1})
}