package classes

var desconto: Double = 0.0 // top level variable (class variable), it's more common to use top
// level
// constants
// (val) than variables, because vars with greater scope are dangerous

class ItemDePedido(val nome: String, val preco: Double) {
    // A companion object creates a single instance of the object in the class, it's just like
    // using static variables or methods in Java
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        //@JvmStatic var desconto: Double = 0.0 // Here desconto is an instance variable
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto // static var are shown in italic
    }
}

fun main() {
    val item1 = ItemDePedido.create("TV 50 Polegadas", 2989.90)
    val item2 = ItemDePedido.create("Liquidificador", 200.0)
    //ItemDePedido.desconto = 0.10
    desconto = 0.10

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}