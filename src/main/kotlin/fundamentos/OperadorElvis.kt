package fundamentos

fun main() {
    val opcional: String? = null // Safe call operator.

    // Atribuição usando o Elvis Operator (https://kotlinlang.org/docs/null-safety.html#elvis-operator)
    val obrigatorio: String = opcional ?: "Valor Padrão"
    println(obrigatorio) // Neste caso será impresso "Valor Padrão" já que 'opcional' é 'null'
}