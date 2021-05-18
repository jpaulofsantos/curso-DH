package Aula11.Exercicio1

class Impressora() {

    var listaImprimivel = mutableListOf<Imprimivel>()


    fun addLista(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimeLista() {
        for (i in listaImprimivel) {
            println(i.imprimir())
        }
    }
}