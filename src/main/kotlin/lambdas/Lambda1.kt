package lambdas

fun main() {
    val soma = { x: Int, y: Int -> // here are the lambda parameters
        x + y // here is the lambda return
        // 1 + 3 // the last sentence is always returned, so here the return will be 4
        // "texto" // here the return is "texto"
    }
    println(soma(4, 6))
}