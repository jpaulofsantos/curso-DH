fun main() {

    //1
    println("1 - " + retornaMaior(25, 3, 19))
    println("----------------")

    //2
    println("2 - " + comparaTextos("ola", "ola"))
    println("2 - " + comparaTextos("ola", "tchau"))
    println("----------------")

    //3
    println("3 - " + verificaPar(10))
    println("3 - " + verificaPar(7))
    println("----------------")

    //4
    println("4 - " + imprimeImpares())
    println("----------------")

    //5
    println("5 - " + verificaNumeros(1,2,3,4))
    println("----------------")

    //6
    println("6 - " + primeirosCem())
    println("----------------")

}

fun retornaMaior(num1: Int, num2: Int, num3:Int): String {
    var list = mutableListOf<Int>()
    list.add(num1)
    list.add(num2)
    list.add(num3)
    list.sort()
    return list.last().toString()
}

fun comparaTextos(texto1: String, texto2: String): Boolean {
    return texto1 == texto2
}

fun verificaPar(num: Int): Boolean {
    return num%2 == 0
}

fun imprimeImpares(): List<Int> {
    var list = mutableListOf<Int>()
    var count = 0
    var num = 1
    while (count < 100) {
        if (num%2 != 0) {
            list.add(num)
            count++
        }
        num++
    }
    return list
}

fun verificaNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return if (numA > numC && numA > numD) {
        true
    } else numB > numC && numB > numD
}

fun primeirosCem(): List<Int> {
    var list = mutableListOf<Int>()
    for (num in 1..100) {
        list.add(num)
    }
    return list
}