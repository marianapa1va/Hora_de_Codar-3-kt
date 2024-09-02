import kotlin.system.exitProcess

fun main(){
    //programa irá ler 2 notas de um aluno, calcular e imprimir a média final. Considerando que a nota de aprovação é 9,5.

    var aprovados = 0

    while (true){

        print("Informe a primeira nota obtida do aluno: ")
        val n1 = readLine()?.toDoubleOrNull() ?: continue

        print("Informe a segunda nota obtida do aluno: ")
        val n2 = readLine()?.toDoubleOrNull() ?: continue

        var media = (n1 + n2)/2

        if (media >= 9.5){
            println("Aluno aprovado!")
            aprovados = aprovados +1

            println("Você deseja calcular a média de mais um aluno? ")
            var resposta = readln()

            if (resposta == "Não"){
                println("Quantidade de alunos aprovados: $aprovados")
                return
            }
        }
        else(println("Aluno reprovado!"))

        println("Você deseja calcular a média de mais um aluno? ")
        var resposta = readln()

        if (resposta == "Não"){
            println("Quantidade de alunos aprovados: $aprovados")
            return
        }


    }


}