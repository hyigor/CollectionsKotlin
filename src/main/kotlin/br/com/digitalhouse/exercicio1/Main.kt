package br.com.digitalhouse.exercicio1

fun main() {
    val mapLoteria = mapOf<Int, String>(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo")

    val mapApelidos = mapOf<String, List<String>>(
        "João" to listOf<String>("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf<String>("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf<String>("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to listOf<String>("Lukinha", "Jorge", "George")
    )

    for (numero in mapLoteria){
        println("Chave ${numero.key} | Valor: ${numero.value}")
    }

    for (pessoa in mapApelidos){
        println("Chave ${pessoa.key} | Valores: ${pessoa.value}")
    }
}