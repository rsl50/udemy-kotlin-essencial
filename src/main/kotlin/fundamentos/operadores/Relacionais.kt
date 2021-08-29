package fundamentos.operadores

import java.util.*

fun main() {
    // referential equality (Igualdade Referêncial) avalia se os dois objetos ocupam o mesmo espaço de memória
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)
    // Igualdade referencial
    println("Resultado com '===' ${d1 === d2}") // retorna 'false' já que são dois objetos em posição de memória diferentes

    // Igualdade estrutural
    println("Resultado com '==' ${d1 == d2}") // retorna 'true' já que o contéudo é o mesmo
    // println("Resultado com '==' ${d1.equals(d2)}") // é o mesmo do que acima
}