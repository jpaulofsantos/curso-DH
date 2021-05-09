import listaAula7.exercicio4.Tripe

fun main() {
    var tripe = Tripe(true, 10, 20, 15)

    println(tripe.definirAltura(4))
    println(tripe.dobrar())
    println(tripe.desdobrar())
    tripe.guardar()
    tripe.usar()
    tripe.definirAltura(-9)
    tripe.dobrar()
    tripe.guardar()
    tripe.usar()

}