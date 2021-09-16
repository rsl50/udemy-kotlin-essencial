package classes

class Calculadora {
    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main() {
    val calculadora = Calculadora()

    // By returning an object 'Calculadora' in the methods, we can create a chain of calls
    calculadora.somar(1,2,3).multiplicar(3).print() // 6 * 3 = 18

    calculadora.somar(7, 10).print().limpar() // 18 + (17) = 35 then clear
    println(calculadora.obterResultado()) // prints 0 due to previous clear
}