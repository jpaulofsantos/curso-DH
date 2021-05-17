package Aula9.exercicio1

fun main() {

    val professor = Professor("João", "008-2")

    val materia1 = Materia("Portugês")
    val materia2 = Materia("Matemática")

    val aula1 = Aula(materia1, "18:00", "20:00")
    val aula2 = Aula(materia2, "20:30", "21:30")

    val aluno1 = Aluno("00976-2", "Carlos", "Rodrigues")
    val aluno2 = Aluno("00976-4", "Maria", "Silva")

    val curso = Curso("Ensino Médio", listOf(aula1, aula2), listOf(aluno1, aluno2), professor)

    val turma = Turma("Turma 1", curso)

    curso.listaAlunos.forEach {
        println("Nome: ${it.nome} ${it.sobreNome} - RA: ${it.RA}")
    }



}