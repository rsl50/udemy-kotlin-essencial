package classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
            // takeIf only returns value if the predicate is true (value.isNotEmpty() = true),
            // otherwise returns 'Anônimo'
        }
    // Here the get/set methods are associated with 'nome' and is accessed through the use of
    // 'field'
}

fun main() {
    val c1 = Cliente2("")
    println(c1.nome)

    val c2 = Cliente2("Pedro")
    c2.nome = "Ana"
    println(c2.nome)
}