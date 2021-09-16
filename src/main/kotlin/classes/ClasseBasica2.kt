package classes

// Here 'nome' is received and can be changed later because it is a var.
class Pessoa1(var nome: String)

// Here 'nome' is received and it is set as a constant (val).
class Pessoa2(val nome: String)

// Here 'nomeInicial' will only be available as a local variable and it is not an instance
// attribute, so it cannot be accessed through the object. This happens because we haven't
// defined the type.
class Pessoa3(nomeInicial: String) {
    val nome: String = nomeInicial
}

fun main() {
    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar!")

    val p2 = Pessoa2("Maria")
    // p2.nome = "Marcos" // val cannot be reassigned
    val p3 = Pessoa3(nomeInicial = "Pedro")
    // p3.nome = "Marcos" // val cannot be reassigned
    // p3.nomeInicial // it cannot be accessed
    println("${p2.nome} e ${p3.nome} são legais!")
}
