package oo.heranca

interface Esportivo {
    var turbo: Boolean

    // In Kotlin we can define a default implementation for a interface function, this was not
    // possible in Java. By doing this, the class which implements this interface doesn't need to
    // implement the method.
    fun ligarTurbo() {
        turbo = true
    }

    fun desligarTurbo() {
        turbo = false
    }
}