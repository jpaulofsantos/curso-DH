class Atleta(var nome: String, var nivel: Int, var energia: Int) {

}

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }
}