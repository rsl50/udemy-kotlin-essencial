package fundamentos

// https://kotlinlang.org/docs/basic-types.html
fun main() {
    // Tipos numéricos inteiros
    val num1 : Byte = 127
    val num2 : Short = 32767
    val num3 : Int = 2_147_483_647
    val num4 : Long = 9_223_372_036_854_775_807 // Long.MAX_VALUE
    val num4a : Long = Long.MAX_VALUE

    println("Valor máximo variável do tipo Byte: $num1")
    println("Valor máximo variável do tipo Short: $num2")
    println("Valor máximo variável do tipo Int: $num3")
    println("Valor máximo variável do tipo Long: $num4")
    println("Valor máximo variável do tipo Long usando constante MAX_VALUE: $num4a")

    // Tipos numéricos Reais
    val num5 : Float = 3.14F
    val num6 : Double = 3.14

    println("Valor variável do tipo Float: $num5")
    println("Valor variável do tipo Double: $num6")

    // Tipo Caractere
    val char : Char = '?' // Outros exemplos... '1', 'g', ' '. O Kotlin não reclama pela declaração com nome 'char', mas em Java está é uma palavra reservada
    println("Valor variável do tipo Char: $char")

    // Tipo booleano
    val boolean : Boolean = true //O Kotlin não reclama pela declaração com nome 'boolean', mas em Java esta é uma palavra reservada
    println("Valor variável do tipo Boolean: $boolean")

    println(2 is Int)
    println(2147483648 is Long)
    println(1.0 is Double)

    // Tudo é objeto - Aqui o método dec() subtrai 1 do valor 10
    println(10.dec())
}