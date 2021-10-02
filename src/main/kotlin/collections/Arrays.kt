package collections

fun main() {
    val numeros = Array<Int>(10) { i -> i * 10}
    // Here we initialize the array as [i] = i * 10 using lambda

    for (numero in numeros) {
        println(numero)
    }

    println("Usando get: ${numeros.get(1)}")
    println("Usando indice: ${numeros[1]}")
    println("Tamanho do array: ${numeros.size}")

    // Changing a value based on index
    numeros.set(1, 1234)
    println(numeros[1])

    numeros[1] = 2345
    println(numeros[1])
}