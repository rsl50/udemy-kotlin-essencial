package lambdas

fun main() {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")
    val ordenados = nomes.sortedBy { it } // nomes.sortedBy({ it }) is the same
    println(ordenados)

    val invertidos = nomes.sortedBy { it.reversed() } // reversed() Returns a string with
    // characters in reversed order.
    println(invertidos)
}