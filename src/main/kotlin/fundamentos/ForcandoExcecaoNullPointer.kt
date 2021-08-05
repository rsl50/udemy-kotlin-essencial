package fundamentos

fun main() {
    val a: Int? = null // Safe call operator.
    println(a?.inc()) // Neste caso retornará 'null' e não lançará nullPointerException.

    println("Momento do erro")
    // Forçando a execução com '!!' o que gera o nullPointerException (https://kotlinlang.org/docs/null-safety.html#the-operator)
    println(a!!.inc())
}