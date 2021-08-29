package fundamentos

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3)) // O Kotlin faz um SmartCast inferindo o tipo de 'x'
    }
}

fun souEsperto2(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase()) // o when não necessita de break como no switch/case
        is Int -> println(x.plus(3))
        else -> println("Repense sua vida!")
    }
}

fun main() {
    souEsperto("Ola")
    souEsperto(9)
    souEsperto2("Opa")
    souEsperto2(7)
    souEsperto2(true)
}