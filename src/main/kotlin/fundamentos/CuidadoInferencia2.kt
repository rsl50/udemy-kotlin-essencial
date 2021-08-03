package fundamentos

fun main() {
    //var a = 1 // Não é possível mudar o tipo inferido após a sua definição, neste caso não é possível atribuir 2.3
    // (Double) para um var do tipo Int)
    var a : Double = 1.0
    var b = 2

    a = 2.3
    print(a + b)
}