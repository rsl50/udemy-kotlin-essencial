package oo.heranca

open class Animal(val nome: String)

class Cachorro : Animal {
    private val altura: Double

    // We need to invoke the constructor of the super class at least once.
    constructor(nome: String, altura: Double) : super(nome) {
        this.altura = altura
    }

    // Here is another way to create another constructor, this invokes another constructor in the
    // same class, declared in line 8
    constructor(nome: String) : this(nome, 0.0)

    override fun toString(): String = "$nome tem $altura cm de altura."
}

fun main() {
    val dogAlemao = Cachorro("Spyke", 84.3)
    val yorkshire = Cachorro("Lady Di")

    println(dogAlemao)
    println(yorkshire)
}