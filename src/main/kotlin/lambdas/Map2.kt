package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = arrayListOf(
    Produto("Fichário escolar", 21.90),
    Produto("Lápis de cor", 11.90),
    Produto("Borracha bicolor", 0.70),
    Produto("Apontador com depósito", 1.80)
)

fun main() {
    // Here the result of the method is passed as 'total' in the next call of reduce as an
    // accumulator
    val totalizar = { total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é R$ ${precoTotal / materialEscolar.size}.")
}