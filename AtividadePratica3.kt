@file:Suppress("SpellCheckingInspection")

fun main (){
    println("""Escolha seu método de transporte preferido, utilizando os números de 1 a 5:
        |1 para metrô, 2 para ônibus, 3 para bike, 4 para táxi, 5 para trem.
    """.trimMargin())
    val input = readln().toInt()
    if (input==1) {
        print("Você escolheu andar de metrô.")
    } else
        if(input==2) {
            print("Você escolheu andar de ônibus.")
        } else
        if(input==3) {
            print("Você escolheu andar de bike.")
        } else
        if(input==4) {
            print("Você escolheu andar de táxi.")
        } else
        if(input==5) {
            print("Você escolheu andar de trem.")
        } else {
            print("Você escolheu andar por outros meios de transporte.")
        }
}