package funcoes

import java.util.*

data class Horario (val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
        // Here 'get' is a reference to 'agora' which is a instance of Calendar.
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main () {
    val (h, m, s) = agora()
    println("$h:$m:$s")
}