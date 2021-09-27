package classes

// In Koltin everything is an object and it is passed as a reference including primitive types.

//fun porReferencia(velocidade: Int) {
//    velocidade++ // val cannot be reassigned.
//}

data class Carro(val marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro) {
    carro.velocidade++
}

fun main() {
    var carro1 = Carro("Ford", "Fusion")
    var carro2 = carro1
    println(carro1 === carro2) // both have the same reference
    carro2.modelo = "Edge"
    println(carro1)

    carro1 = Carro("Audi", "A4")

    println(carro1 === carro2) // they don't have the same reference anymore
    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1) //velocidade=1
    println(carro2) //velocidade=1

    var a = 1
    var b = a
    println(a === b) // both have the same reference
    b++
    println(a === b) // they don't have the same reference anymore
    println(a)
    println(b)

}