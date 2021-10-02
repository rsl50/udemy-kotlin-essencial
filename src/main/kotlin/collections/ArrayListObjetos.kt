package collections

data class Fruta (var nome : String, var preco: Double)

fun main() {
    val frutas = arrayListOf(Fruta("Banana", 1.50), Fruta("Morango", 3.20))

    for (fruta in frutas){
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Fruta("Banana", 1.50)))
    // returns true because the data class implements equals() to compare the objects

    println(frutas.distinctBy { it.preco })
    // Returns a list containing only elements from the given collection having distinct keys
    // returned by the given selector function. In this case, because preco is different it will
    // return both elements
}