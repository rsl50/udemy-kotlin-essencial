package fundamentos

fun main() {
    val a : Int = 33.dec() // Em Kotlin tudo é objeto. A notação '.' permite acessar métodos relativos aos objetos.
    val b : String = a.toString()

    println("Int: $a")
    println("O primeiro char da string b é: ${b.first()}")
}