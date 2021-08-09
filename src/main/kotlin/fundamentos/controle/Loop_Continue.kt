package fundamentos.controle

fun main() {
    for (i in 1..10) {
        if (i == 5) {
            continue // o continue fará o loop pular para a próxima iteração, não mostrando o valor 5
        }
        println("Atual: $i")
    }
    println("Fim!")
}