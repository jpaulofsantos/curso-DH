fun main() {
    var atleta1 = Atleta("João", 5, 7)
    var atleta2 = Atleta("Pedro", 4, 5)

    var prova1 = Prova(3, 6)
    var prova2 = Prova(4, 4)
    var prova3 = Prova(6, 5)

    println("--------")
    println("PROVA 1 - ATLETA 1 = " + prova1.podeRealizar(atleta1))
    println("PROVA 1 - ATLETA 2 = " +prova1.podeRealizar(atleta2))

    println("--------")
    println("PROVA 2 - ATLETA 1 = " + prova2.podeRealizar(atleta1))
    println("PROVA 2 - ATLETA 2 = " +prova2.podeRealizar(atleta2))

    println("--------")
    println("PROVA 3 - ATLETA 1 = " + prova3.podeRealizar(atleta1))
    println("PROVA 3 - ATLETA 2 = " +prova3.podeRealizar(atleta2))

}