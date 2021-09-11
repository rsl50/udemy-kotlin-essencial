package funcoes

// TopLevel functions are functions that exists outside a class
// In Kotlin there is no need to create a class to create a static function for example
fun min(a: Int, b: Int): Int = if(a < b) a else b

fun main () {
    println("O menor valor é ${min(3, 4)}")
}