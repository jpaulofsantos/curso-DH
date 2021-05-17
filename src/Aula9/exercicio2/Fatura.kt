package Aula9.exercicio2
import kotlin.math.round

class Fatura(var numItem:Int, var descricao:String, var quantidade:Int, var preco:Double) {

    fun getTotalFatura(): Double {
        return (quantidade * preco)
    }
}