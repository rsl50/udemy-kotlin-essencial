package avancado

/**
 * Using Annotations and Reflections
 * https://kotlinlang.org/docs/annotations.html
 * https://kotlinlang.org/docs/reflection.html
 */

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, nome: String) {
    @Positivo
    var id: Int = id

    @NaoVazio
    var nome: String = nome
}

// Reflection
// This method returns the value of an attribute based on its named in String.
fun getValor(objeto: Any, nomeDoAtributo: String): Any {
    val atributo = objeto.javaClass.getDeclaredField(nomeDoAtributo)
    val estaAcessivel = atributo.isAccessible // Here we get the current state

    atributo.isAccessible = true // We change it to 'true' in 'atributo'
    val valor = atributo.get(objeto)
    atributo.isAccessible = estaAcessivel // Then we restore the original state

    return valor
}

fun validar(objeto: Any) : List<String> {
    val msgs = ArrayList<String>()

    objeto::class.members.forEach {  member ->
        member.annotations.forEach { annotation ->
            val valor = getValor(objeto, member.name)
            when (annotation) {
                is Positivo ->
                    if (valor !is Int || valor <= 0) {
                        msgs.add("O valor '$valor' não é um número positivo!")
                    }
                is NaoVazio ->
                    if (valor !is String || valor.trim().isEmpty()) {
                        msgs.add("O valor '$valor' atual não é uma String válida")
                    }
            }
        }
    }

    return msgs
}

fun main() {
    val objeto1 = Pessoa(1, "Chico")
    println(validar(objeto1))

    val objeto2 = Pessoa(-1, "   ")
    println(validar(objeto2))
}