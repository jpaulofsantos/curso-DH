package Aula11.Exercicio1

fun main () {

    println("------------")
    println("OBJ. SEPARADOS")
    println("------------")
    val foto = Foto()
    foto.imprimir()

    val documento = Documento()
    documento.imprimir()

    val contrato = Contrato()
    contrato.imprimir()

    println("------------")
    println("LISTA")
    println("------------")

    val impressora = Impressora()
    impressora.addLista(foto)
    impressora.addLista(documento)
    impressora.addLista(contrato)

    impressora.imprimeLista()

}