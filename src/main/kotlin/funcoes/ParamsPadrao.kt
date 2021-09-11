package funcoes

fun potencia(base: Int = 2, expoente: Int = 1): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main () {
    println(potencia(2, 3))
    println(potencia(10)) // base 10, expoente default 1
    println(potencia())  // base default 2, expoente default 1
    println(potencia(base = 10)) // base 10, expoente default 1
    println(potencia(expoente = 8)) // base default 2, expoente 8
}