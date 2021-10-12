package avancado

fun fatorial(num: Int): Int = when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1)
    else -> throw IllegalAccessException("Número negativo")
}

fun main() {
    println(fatorial(0))
    println(fatorial(1))
    println(fatorial(3))
    println(fatorial(5))
    //println(fatorial(-1))
}