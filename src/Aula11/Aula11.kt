package Aula11

fun main() {


}

class EstadoSP(override val icms: Double) : RegraDeOuro {

    override fun recolherEstadoSP(): Double {
        TODO("Not yet implemented")
    }

    override fun recolherEstaboSPABC(): String {
        TODO("Not yet implemented")
    }

}

interface RegraDeOuro {

    val icms: Double

    fun recolherEstadoSP(): Double

    fun recolherEstaboSPABC(): String

}

abstract class RegraDePrata {



    abstract fun recolherEstadoSP(): Double

    abstract fun recolherEstaboSPABC(): String

}