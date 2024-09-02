fun main(){
    //Calcula a média dos valores entre 15 e 100.

    var contagem = 0
    var inclusive = 15

    while (inclusive <= 100){
        println("$inclusive")
        inclusive = inclusive +1
        Thread.sleep(200)

    }
    val resultado = (inclusive)/2
    println("O valor da média é: $resultado")

}