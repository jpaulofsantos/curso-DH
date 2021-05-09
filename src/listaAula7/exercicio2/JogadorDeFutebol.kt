class JogadorDeFutebol(
    var nome: String,
    var energia: Int,
    var alegria: Int,
    var gols: Int,
    var experiencia: Int) {

    fun fazerGol() {
        energia -= 5
        alegria += 10
        println("GOOOOL! - Energia = $energia - Alegria = $alegria")
    }

    fun correr() {
        energia -= 10
        println("Cansei - Energia = $energia")
    }
}

class SessaoDeTreinamento() {

    fun treinarA(jogador:JogadorDeFutebol) {
        println("Experiencia inicial = ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        var experiencia = 1
        jogador.experiencia += experiencia
        println("Experiencia final = ${jogador.experiencia}")
    }

}

