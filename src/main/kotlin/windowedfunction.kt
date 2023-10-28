//its similar to chuncked function but windowed function give more flexablity
fun main() {
    val number = listOf<String>("one","tow","three","four","fice","Six","Seven")
    println(number.windowed(3))
}