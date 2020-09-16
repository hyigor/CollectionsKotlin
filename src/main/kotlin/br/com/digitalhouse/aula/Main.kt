package br.com.digitalhouse.aula

fun main() {
    val estados = listOf("São Paulo", "Pará", "Rio de Janeiro")
    println("O número de elementos da lista é ${estados.size}")
    println("Pegando o terceiro elemento: ${estados.get(2)}")
    println("Índice do Pará: ${estados.indexOf("Pará")}")

    println("---------------")

    val estados2 = mutableListOf("Minas Gerais", "Bahia", "Ceará")
    estados2.add("Espírito Santo")
    println(estados)
    estados2[0] = "Distrito Federal"
    println(estados2)
    estados2.add(0, "Pernambuco")
    println(estados2)

    println("---------------")

    val estados3 = setOf("Paraná", "São Paulo", "Distrito Federal", "Mato Grosso")
    println("Quantidade de estados: ${estados3.size}")
    if(estados3.contains("Bahia")){
        println("Bahia está no conjunto")
    } else {
        println("Bahia não está no conjunto")
    }

    val estados3descrecente = setOf("Mato Grosso", "Distrito Federal", "São Paulo", "Paraná")

    if (estados3descrecente == estados3){
        println(true)
    } else {
        println(false)
    }

    println("---------------")

    val estados4 = mutableSetOf<String>()
    estados4.add("SP")
    estados4.add("RJ")
    estados4.add("MG")

}