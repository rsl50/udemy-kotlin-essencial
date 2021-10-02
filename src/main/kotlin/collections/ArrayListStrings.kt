package collections

fun main() {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")
    // The function arrayListOf() can infer the type of its contents, so in this case we can use
    // string functions on its items, since they are all strings.
    for (item in strings) {
        println(item.toUpperCase())
    }
}