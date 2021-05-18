package Aula10

import java.util.*

fun main() {

    println("Digite 1 normal ou 2 VIP")
    val scanner = Scanner(System.`in`)
    val ingresso1 = scanner.nextInt()

    if (ingresso1 == 1) {
        println("Ingresso normal")
    } else {
        println("Digite 1 Cam. Sup ou 2 Cam. Inf")

        val camarote = scanner.nextInt()

        if (camarote == 1) {
            val camaroteSuperior = CamaroteSuperior(100.0, 50.0)
            println(camaroteSuperior.valorIngressoVIP())
        } else {
            val camaroteInferior = CamaroteInferior(100.0, 2)
            println(camaroteInferior.valorIngressoVIP())
        }
    }




}