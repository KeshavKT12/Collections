//Splits this char sequence into a list of strings each not exceeding the given size. 
fun main() {
    val number = (0..13).toList()
    println(number.chunked(4))
    //you can performe some transformation like sum etc..
    println(number.chunked(3){it.sum()})
}