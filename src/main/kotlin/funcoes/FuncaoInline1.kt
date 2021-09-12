package funcoes

inline fun transacao(a: Int = 0, funcao: () -> Unit) {
    println("Abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação.")
    }
    println("a:$a")
}

fun main() {
    // You can also pass parameters to the function using using:
    /*
        transacao() {
            println("Executando SQL 1...")
            println("Executando SQL 2...")
            println("Executando SQL 3...")
        }

        or

        transacao ({
            println("Executando SQL 1...")
            println("Executando SQL 2...")
            println("Executando SQL 3...")
        })
     */
    // transacao() { ... }
    transacao(2) {
        // Here we are passing the 'funcao' parameter
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}