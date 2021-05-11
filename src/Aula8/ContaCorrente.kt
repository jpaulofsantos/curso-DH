package Aula8

class ContaCorrente(cliente: Cliente, var saldo: Double, var limiteChequeEspecial: Double): Conta(cliente) {

    override fun fazerDeposito(valorDeposito: Double) {
        saldo += valorDeposito

    }

    override fun sacarDinheiro(valorSaque: Double) {
        if (valorSaque > saldo) {
            limiteChequeEspecial -= (valorSaque-saldo)
        } else {
            saldo -= valorSaque
        }
    }

    fun depositarCheque(valorCheque: Double, bancoEmissor: String, dataPagamento: String) {
        saldo += valorCheque
    }
}