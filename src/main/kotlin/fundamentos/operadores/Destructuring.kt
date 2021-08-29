package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    // Operador destructuring, retira os valores direto da instancia do objeto
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca $modelo")

    val (a, b) = Carro("Ferrari", "Modena")
    println("$a $b")

    // É possível aplicar também em listas
    val (marido, mulher) = listOf("Joao", "Maria")
    println("$marido e $mulher")

    // Neste caso os indexes 0, 1 da lista serão ignorados
    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar.")
}