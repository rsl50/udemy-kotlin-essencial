package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    // variable 'local' scope's is only inside this method
    val  local = "Fulano!"
    println("$diretamenteNoArquivo, $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object {
        // How to force the creation of a static variable in Kotlin, this allows the access as
        // static in Java
        @JvmStatic val constanteDeClasse = "Ciclano"
        // Removing the @JvmStatic will make 'constanteDeClasse' a member of the companion
        // object,  it's like a singleton object. Removing the annotation will make
        // 'println(Coisa.constanteDeClasse)' stop working.
    }

    fun fazer() {
        // variable 'local' scope's is only inside this method
        val local: Int = 7

        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco!")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}