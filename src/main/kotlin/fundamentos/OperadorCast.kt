package fundamentos

fun imprimirConceito(nota: Any) {
    // o operador 'as' faz o cast de nota para Int
    //when (nota as? Int ?: 10) {
    when (nota as? Int) {
        10, 9 -> println("A")
        8,7 -> println("B")
        6,5 -> println("C")
        4,3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        // imprimirConceito(nota) // imprime Nota inválida já que sem o casting é passado um valor Double
        imprimirConceito(nota.toInt())
    }
}