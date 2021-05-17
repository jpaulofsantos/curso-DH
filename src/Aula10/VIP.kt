package Aula10

open class VIP(var valorAdicional: Double, valor: Double) : Ingresso(valor) {

    fun valorIngressoVIP() {
        println(valorAdicional + valor)
    }
}