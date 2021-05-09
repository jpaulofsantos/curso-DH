package listaAula7.exercicio1

import Cliente
import Conta

class Exercicio1 {
}

fun main() {

    var cliente = Cliente("João Paulo", "Santos")
    var conta = Conta("123", 300.00, cliente)
    println("---------")
    println("${cliente.nome}, com saldo inicial de ${conta.saldo}")
    println(conta.deposito(100.0))
    println(conta.saque(100.00))
    println(conta.saque(500.00))

    var cliente1 = Cliente("Pedro", "Santos")
    var conta1 = Conta("1234", 500.00, cliente)
    println("---------")
    println("${cliente1.nome}, com saldo inicial de ${conta1.saldo}")
    println(conta1.deposito(200.0))
    println(conta1.saque(15000.00))
    println(conta1.saque(700.00))

}