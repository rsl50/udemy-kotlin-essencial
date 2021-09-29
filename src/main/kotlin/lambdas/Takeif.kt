package lambdas

fun main() {
    println("Digite sua mensagem: ")

    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"
    // We check the string for empty before because the elvis operator accepts an empty string

    println(mensagem)
}