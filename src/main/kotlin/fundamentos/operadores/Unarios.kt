package fundamentos.operadores

fun main() {
    var num1: Int = 1
    var num2: Int = 2

    // pós-fixado
    num1++
    println(num1)

    // pré-fixado
    --num1
    println(num1)

    // Incremento decremento
    println(++num1 == num2--)
    // true já que o incremento é feito antes da comparação, o operador ++ pré-fixado tem precedência ao == e ao
    // -- pós-fixado
    println(num1 == num2) // false
}