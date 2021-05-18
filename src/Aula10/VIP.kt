package Aula10

open class VIP(valor: Double, var valorAdicional: Double = 0.0 ) : Ingresso(valor) {

    fun valorIngressoVIP() {
        println(valorAdicional + valor)
    }
}