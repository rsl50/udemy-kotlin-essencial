package fundamentos.controle

fun main() {
    var opcao: Int = 0

    while(opcao != -1) {
        val line = readLine() ?: "0" //retorna 0 caso usuário entre 'null'
        opcao = line.toIntOrNull() ?: 0 //caso seja null retorna 0

        println("Você escolheu a opção $opcao")
    }

    println("Até a próxima!")
}