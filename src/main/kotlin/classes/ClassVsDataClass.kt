package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    // returns false, because they have different addresses in memory, is the same as invoking
    // 'equals()'
    println(g1 == g2)
    println(g1.toString())

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2) // the same as calling equals to compare the objects values
    println(tv1 === tv2) // here the result is false because they have different addresses in memory
    println(tv1.toString())

    // copy() creates a copy of the object, this is useful in functional programming for using
    // immutable data/constants
    println(tv1.copy())
    println(tv1.copy(polegadas = 42))

    // Destructuring in data class
    // this doesn't not work for Geladeira because it is not a data class  and do not have the
    // access methods
//    val (marca, litros) = g1
//    println("$marca $litros")
    val (marca, pol) = tv1
    println("$marca $pol")
}