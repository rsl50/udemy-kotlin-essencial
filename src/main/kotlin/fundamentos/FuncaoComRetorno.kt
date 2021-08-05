package fundamentos

// Neste caso, o parâmetro b possui o valor padrão '1' caso não seja informado um valor
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    println(soma(2, 3))
    println(soma(11)) // Como o valor do parâmetro 'b' não foi informado, será usado o valor padrão '1' retornando então a soma '12'
}