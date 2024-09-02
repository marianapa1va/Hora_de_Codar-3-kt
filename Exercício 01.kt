fun main(){
    //O programa irá dividir os dois valores. Porém, o segundo valor não pode ser nulo e nem negativo

    print("Informe o primeiro valor: ")
    var v1 = readln().toDouble()

    print("Informe o segundo valor: ")
    var v2 = readln().toDouble()

    var divisao = v1 / v2

    if (v2 <= 0){
        println("Valor inválido!")
    }
    if (v2 >= 1) {
        println("O valor da divisão é: $divisao")
    }
}