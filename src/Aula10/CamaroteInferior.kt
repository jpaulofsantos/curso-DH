package Aula10

class CamaroteInferior(valor:Double, valorAdicional:Double, var localizacao: Int) : VIP(valor, valorAdicional) {

    fun localIngresso() {
        println(localizacao)
    }
}