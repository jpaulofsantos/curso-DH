package Aula11.Exercicio1

class Contrato(override val nome: String = "Sou", override val tipoDocumento: String = "Contrato"): Imprimivel {

    override fun imprimir() {
        println("${nome} um ${tipoDocumento} muito legal")
    }


}