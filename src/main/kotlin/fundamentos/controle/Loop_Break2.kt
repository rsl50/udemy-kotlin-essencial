package fundamentos.controle

fun main() {
    externo@for (i in 1..15) {
        for (j in 1..15) {
            if (i == 2 && j == 9) break@externo // o laço rotulado como 'externo' será interrompido pelo break.
            println("$i $j")
        }
    }
    println("Fim!")
}