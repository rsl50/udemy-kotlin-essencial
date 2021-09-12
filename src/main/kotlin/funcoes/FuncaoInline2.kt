package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizando...")
    }
}

fun somar2(a: Int, b: Int): Int {
    println("somando")
    return a + b
}

fun main() {
    val resultado = executarComLog("somar") {
        // Inside a Lambda function, the last code sentence will return the value implicitly.
        somar2(4, 5)
        // 1 + 2 // Here the return will be 3 because it is the last code sentence.
    }

    // We call also invoke the method like this
//    val resultado = executarComLog("somar", {
//        somar2(4, 5)
//    })

        println(resultado)

}