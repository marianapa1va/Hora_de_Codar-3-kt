fun main(){
    // O programa irá ler ler as notas de avaliações de um aluno, calcular e imprimir a média (simples) desse aluno. Só sendo aceitos valores de (0 a 10) para cada nota.

       for (media in 0 until 11) {
        print("Informe a primeira nota da avaliação do aluno: ")
        val av1 = readln().toDouble()

        print("Informe a segunda nota da avaliação do aluno: ")
        val av2 = readln().toDouble()

        print("Informe a terceira nota da avaliação do aluno: ")
        val av3 = readln().toDouble()

        print("Informe a quarta nota da avaliação do aluno: ")
        val av4 = readln().toDouble()

        print("Informe a quinta nota da avaliação do aluno: ")
        val av5 = readln().toDouble()

        print("Informe a sexta nota da avaliação do aluno: ")
        val av6 = readln().toDouble()

        var media = (av1 + av2 + av3 + av4 + av5 + av6) / 6

        if (media >= 0 == media <= 10) {
            println("O valor da média das avaliações é: $media")
            return
        }
        else(println("Número inválido. Tente novamente e não esqueça de escrever números de 0 até 10."))
         return
    }
}