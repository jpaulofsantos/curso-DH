package Aula10

class CamaroteInferior(valor:Double, var localizacao: Int) : VIP(valor) {

    fun localIngresso() {
        println(localizacao)
    }
}