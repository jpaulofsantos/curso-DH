package Aula11.Exercicio1

interface Imprimivel {

    val nome: String
    val tipoDocumento: String

    fun imprimir() {
        println("Nome: $nome, Documento: $tipoDocumento")
    }
}

