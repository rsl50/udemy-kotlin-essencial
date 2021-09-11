package funcoes

// Adding the extended function secondOrNull to the List class
fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) this.get(1) else null

fun main() {
    val list1 = listOf("João", "Maria", "Pedro")
    println(list1.secondOrNull())

    val list2 = listOf("João")
    println(list2.secondOrNull())
}