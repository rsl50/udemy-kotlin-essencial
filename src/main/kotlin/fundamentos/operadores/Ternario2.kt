package fundamentos.operadores

fun main() {
    println(obterResultado(5.0))
}

fun obterResultado(nota : Double) : String = if (nota >= 7) "Passou" else "Reprovado"
// Mesmo resultado que o método acima
//fun obterResultado(nota : Double) : String {
//    return if (nota >= 7) "Passou" else "Reprovado"
//}