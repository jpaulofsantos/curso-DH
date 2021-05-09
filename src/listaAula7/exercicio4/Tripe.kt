package listaAula7.exercicio4

class Tripe(
    var dobrado: Boolean,
    var alturaMinima: Int,
    var alturaMaxima: Int,
    var alturaAtual: Int
) {

    fun definirAltura(novaAltura: Int) {
        println("Altura anterior: $alturaAtual")
        alturaAtual += novaAltura
        println("Altura atual após aumentar $novaAltura: $alturaAtual")
    }

    fun dobrar(): Boolean {
        dobrado = true
        return dobrado
    }

    fun desdobrar(): Boolean {
        dobrado = false
        return dobrado
    }

    fun guardar() {
        if (prontoParaGuardar()) {
            println("GUARDADO")
        } else {
            println("NÃO PODE SER GUARDADO")
        }

    }

    fun prontoParaGuardar(): Boolean {
        return dobrado && (alturaAtual == alturaMinima)
    }

    fun usar() {
        if (prontoParaUsar()) {
            println("USADO")
        } else {
            println("NÃO PODE SER USADO")
        }
    }

    fun prontoParaUsar(): Boolean {
        return !dobrado && (alturaAtual > (alturaMaxima/2))
    }


}