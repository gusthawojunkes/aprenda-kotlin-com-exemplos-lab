enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    val nivel: Nivel = Nivel.INTERMEDIARIO

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("O usuário ${usuario.nome} se matriculou na formação '$nome'")
    }
}

fun main() {
    val gusthawo = Usuario("Gusthawo Junkes")
    val conteudos = mutableListOf(ConteudoEducacional("Kotlin Básico", 20), ConteudoEducacional("Kotlin Avançado", 40))
    val formacao = Formacao("Bootcamp de Kotlin", conteudos)
    formacao.matricular(gusthawo)
}