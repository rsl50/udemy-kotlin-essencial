package funcoes

fun incremento(num: Int) {
    // Function parameters in Kotlin are constants (defined as val), so it is not possible to
    // change its reference.
    //num++ // num = num + 1
}

fun main () {
   incremento(3)
}