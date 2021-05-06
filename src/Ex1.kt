class Ex1(var idade: Int, var sexo: String, var tempoContribuicao: Int) {

    fun calculos(): Boolean {
        idade = this.idade
        sexo = this.sexo
        tempoContribuicao = this.tempoContribuicao

        return if(idade>=60 && sexo == "F" && tempoContribuicao >=30) {
            true
        } else idade>=65 && sexo == "M" && tempoContribuicao >=30
    }
}

fun main() {
    var ex1 = Ex1(60, "F", 30)
    println(ex1.calculos())
    var ex11 = Ex1(59, "F", 30)
    println(ex11.calculos())
    var ex12 = Ex1(65, "M", 30)
    println(ex12.calculos())
    var ex13 = Ex1(64, "M", 30)
    println(ex13.calculos())
}