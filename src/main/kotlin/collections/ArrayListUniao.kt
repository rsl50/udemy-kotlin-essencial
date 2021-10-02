package collections

fun main() {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafael", "Pedro", "Leandro", "Gustavo")
    val uniao = numeros + strings // operator overload, it generates a list of <Any>

    for (item in uniao) {
        println(item)
    }
}