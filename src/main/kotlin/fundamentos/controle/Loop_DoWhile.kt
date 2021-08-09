package fundamentos.controle

fun main() {
    var opcao: Int = -1

    // Garante a execução o laço pelo menos uma vez
    do {
        val line = readLine() ?: "0" //retorna 0 caso usuário entre 'null'
        opcao = line.toIntOrNull() ?: 0 //caso seja null retorna 0

        println("Você escolheu a opção $opcao")
    } while(opcao != -1)

    println("Até a próxima!")
}