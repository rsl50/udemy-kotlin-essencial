package fundamentos.controle

fun main() {
    val nota: Double = 9.0

    // Usando operador range
    if (nota in 9.0..10.0) {
        println("Fantástico")
    } else if (nota in 7.0..8.0) {
        println("Parabéns")
    } else if (nota in 4.0..6.0) {
        println("Tem como recuperar")
    } else if (nota in 0.0..3.0) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }

    println(5 in 7..4) // Retorna false pois o range sempre verificar do menor para o maior
    println(5 in 4..7) // Retorna true
}