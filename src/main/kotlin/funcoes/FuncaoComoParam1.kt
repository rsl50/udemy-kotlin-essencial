package funcoes

class Operacoes {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

// Here we set a function as parameter. It receives (Int, Int) and returns Int (-> Int)
fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun main() {
    // Here we call Operacoes.somar()
    println(calc(2, 3, Operacoes()::somar))
    // Here we call the Top Level function somar()
    println(calc(2, 2, ::somar))
}