package collections

// Here que create an extension function to make it easier to print in this exercise.
fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)
    // conjunto.get(1) doesn't work because Set is not indexed

    conjunto.add(3).print() // returns false because Set doesn't allow duplicated values
    conjunto.add(10).print() // in this case, returns true
    conjunto.size.print()
    conjunto.remove("a").print() // return false because "a" (string) is different than 'a'
    // (character).
    conjunto.remove('a').print() // returns true
    conjunto.contains('a').print() // returns false
    conjunto.contains("Texto").print() // returns false
    conjunto.contains("texto").print() // returns true

    val nums = setOf(1, 2, 3)
    // nums.add(4) doesn't work because setOf() creates a read-only Set
    (conjunto + nums).print() // prints the union of both Sets, Set is not ordered by default
    (conjunto - nums).print() // removes nums from conjunto and prints the result

    conjunto.intersect(nums).print() // doesn't change 'conjunto', returns only the intersection [3]
    conjunto.retainAll(nums) // changes 'conjunto'
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print() // returns true
}