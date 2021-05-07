

//1
class Cliente(var nome: String, var sobreNome:String) {

}

//2
class Conta(var nroConta: String, var saldo: Double, var titular: Cliente) {
    //3
    fun deposito(valorDeposito: Double): String {
        saldo += valorDeposito

        return "Depósito no valor de $valorDeposito. Novo saldo: $saldo"
    }

    fun saque(valorSaque: Double): String {
        if (valorSaque > saldo) {
            return "Saldo Insuficiente"
        } else {
            saldo -= valorSaque
            return "Saque no valor de $valorSaque. Novo saldo: $saldo"
        }
    }

}

