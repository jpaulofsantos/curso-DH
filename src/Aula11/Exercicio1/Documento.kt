package Aula11.Exercicio1

class Documento(override val nome: String = "Eu", override val tipoDocumento: String = "Documento Word"): Imprimivel {

    override fun imprimir() {
        println("${nome} sou um ${tipoDocumento}")
    }
}