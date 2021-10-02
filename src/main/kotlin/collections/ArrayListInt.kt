package collections

fun main() {
    val pares = arrayListOf(2, 4, 6)
    val impares = intArrayOf(1, 3 ,5)

    // Below, the a new list is returned with the union between impares and pares and then this
    // list is sorted
    for (n in impares.union(pares).sorted()) {
        print("$n")
    }
}