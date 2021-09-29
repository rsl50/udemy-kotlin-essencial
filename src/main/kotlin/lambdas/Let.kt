package lambdas

fun main() {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for (item in listWithNulls) {
        item?.let {
            println(it.toLowerCase())
        // Only non-null values will be printed because we used 'item?' which is a null-safe call.
        }
        // Different from apply(), let() returns an Unit object and not the object itself.
    }
}