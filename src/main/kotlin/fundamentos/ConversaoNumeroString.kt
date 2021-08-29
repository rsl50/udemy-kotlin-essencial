package fundamentos.operadores

fun main() {
    val a = 1

    // Número para String
    println(a.toString() + 1) // retorna '11'

    // String para Número
    println("1.9".toDouble() + 3) // retorna '4.9'
    println("Teste".toIntOrNull()) // retorna 'null'
    println("Teste".toIntOrNull() ?: 0) // retorna '0'
    println("1".toInt() + 3) // retorna '4'
}