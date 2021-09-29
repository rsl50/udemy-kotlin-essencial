package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
    var casa = Casa()

    casa.run {
        endereco = "Rua ABC"
        num = 1234
    }
    // Different from apply(), run() returns an Unit object and not the object itself.

    println(casa)
}