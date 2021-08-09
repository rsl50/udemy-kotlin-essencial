package fundamentos.controle

fun main() {
    val num1: Int = 5
    val num2: Int = 3

//    val maiorValor = if (num1 > num2) {
//        println("processando")
//        num1
//    } else {
//        println("processando")
//        num2
//    }

    val maiorValor = if (num1 > num2) num1 else num2

    println("O maior valor é $maiorValor")
}