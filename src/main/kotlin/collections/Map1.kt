package collections

fun main() {
    val map = HashMap<Long, String>()
    map.put(10020030040, "João")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")

    // Because the key 60070080090 already exists in the map, 'Pedro' is replaced by 'Pedro Filho'
    map.put(60070080090, "Pedro Filho")

    for (par in map) { // maps.entries produces the same effect
        println(par) // Prints the key-value pair, it is not ordered
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(30040050060)?.print() // Here we use the null-safe call ? because the result can be
    // null if the key doesn't exists
    map[30040050060]?.print() // returns the same as above
    map.contains(30040050060).print() // returns true in this case
    map.remove(30040050060)?.print() // returns the value of the removed item, in this case 'Maria'
    map.clear()
    map.isEmpty().print()
}