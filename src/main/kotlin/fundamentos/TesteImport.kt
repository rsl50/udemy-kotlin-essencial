package fundamentos

// Fazendo imports de forma explicita
import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("Ok")) // Demonstrando o import explicito do println()

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("Soma: ${soma(2, 4)} e Subtracao: ${subtracao(4, 6)}")
}