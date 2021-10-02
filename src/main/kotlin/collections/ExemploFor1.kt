package collections

fun main() {
    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

    for (aluno in alunos) {
        println(aluno)
    }

    // Using destructuring operator to navigate the list using indexes
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}