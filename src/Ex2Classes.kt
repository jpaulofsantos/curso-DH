class Ex2Classes(var lista: List<Int>) {


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
    var ex2 = Ex2Classes(listOf(2,3,2,5))
    println(ex2.multiplicaNumerosLista())
}