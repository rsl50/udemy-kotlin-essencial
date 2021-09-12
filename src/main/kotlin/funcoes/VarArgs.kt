package funcoes

// In Kotlin 'vararg' is equivalent to Java '...'. The set of arguments are converted internally
// to an array.
// In Java the variable parameters needed to be the last argument always, in Kotlin no, however the
// parameters must be named to be separated from the vararg.
fun ordenar(vararg numeros: Int, a: Int = 1): IntArray {
    println("a:$a")
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(38, 3, 456, 8, 51, 1, 88, 73, a = 3)) {
        println("$n")
    }
    println()
    for (n in ordenar()) {
        println("$n")
    }
    println()
    for (n in ordenar(50, a = 2)) {
        println("$n")
    }
}