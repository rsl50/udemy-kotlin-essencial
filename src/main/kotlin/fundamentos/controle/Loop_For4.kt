package fundamentos.controle

fun main() {
    val alunos = arrayListOf("André", "Carla", "Marcos")

    // (indice, aluno) é mesmo uso do operador destructuring onde o objeto aluno retorno tem seu index e instância
    // separados em indice e aluno
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}