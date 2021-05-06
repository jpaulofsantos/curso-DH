class Ex2(var lista: List<Int>) {


    fun multiplicaNumerosLista(): Int {
        var list = this.lista
        var result: Int = 1
        for (num in list) {
            result *= num
        }
        return result
    }
}

fun main() {
    var ex2 = Ex2(listOf(2,2,2,2))
    println(ex2.multiplicaNumerosLista())
}