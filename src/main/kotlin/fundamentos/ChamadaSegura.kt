package fundamentos

fun main() {
    val a: Int? = null // Safe call operator (https://kotlinlang.org/docs/null-safety.html#safe-calls).
    println(a?.dec()) // Neste caso retornará 'null' e não lançará nullPointerException.
}