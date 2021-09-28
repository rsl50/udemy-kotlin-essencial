package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Artur", 8.0),
        Aluno("Rafael", 9.7),
        Aluno("Ricardo", 5.7)
    )

    // the filter and sortedBy methods returns a new list, so 'alunos' is not changed
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
    println(aprovados)
}