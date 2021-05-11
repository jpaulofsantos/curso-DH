package Aula8

class ContaPoupanca(var saldo: Double, var taxaJuros: Double, cliente: Cliente): Conta(cliente) {

    override fun fazerDeposito(valorDeposito: Double) {
        saldo =+ valorDeposito
    }

    override fun sacarDinheiro(valorSaque: Double) {
        saldo -= valorSaque
    }

    fun recolherJuros() {
        saldo =+ (saldo * taxaJuros)
    }
}