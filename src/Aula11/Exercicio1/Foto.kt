package Aula11.Exercicio1

class Foto(override val nome: String = "Eu", override val tipoDocumento: String = "Selfie"): Imprimivel {

    override fun imprimir() {
        println("${nome} sou uma ${tipoDocumento}")
    }

}