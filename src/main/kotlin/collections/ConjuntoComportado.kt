package collections

fun main() {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    // aprovados.add(1) doesn't work because this Set only accepts Strings

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print() // Here we use the same function defined in 'ConjuntoBaguncado'
    }

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nLinkedSet... (Garante a ordem de inclusão)")
    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print()
    }

    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nSortedSet... (Segue ordem alfabética)")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print()
    }

    // Crazy order, using the second letter of the string for sorting
    aprovados.sortedBy { it.substring(1) }.print()
}