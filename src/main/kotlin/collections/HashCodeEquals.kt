package collections

class Objeto(val nome: String, val descricao: String) {
    // A hashCode is like a database index, it provides a faster way to find something because
    // just compare numbers.
    override fun hashCode(): Int {
        return nome.length // This is just an example, it is not a good implementation of hashCode
    }

    // equals is slower than the hashCode, so equals() runs after hashCode().
    // hashCode() returns a set of elements with matching hashCodes and then check them with
    // equals(), usually the set should have only one item.
    // hashCode should not be random.
    // In a data class all attributes are used in the the equals method
    override fun equals(other: Any?) = if (other is Objeto) {
        nome.equals(other.nome, ignoreCase = true)
    } else {
        false
    }
}

fun main() {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."), // Hashcode = 7
        Objeto("Mesa", "..."), // Hashcode = 4
        Objeto("Faca", "..."), // Hashcode = 4
        Objeto("Copo", "..."), // Hashcode = 4
    )

    // returns true because we ignore case
    conjunto.contains(Objeto("faca", "???")).print()
}