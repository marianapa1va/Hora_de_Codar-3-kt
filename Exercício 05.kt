fun main(){
    //O programa irá ler dois valores e calculará a media artimética.

    println("A seguir leve em consideração que o primeiro número deve ser menor que o segundo.")

    print("Informe o primeiro valor: ")
    var v1 = readln().toDouble()

    print("Informe o segundo valor: ")
    var v2 = readln().toDouble()

    if ( v1 < v2){

        var soma = 0.0
        var quantidade = 0

        var i = v1
        while (i <= v2){
            soma += i
            quantidade++
            i += 1
        }

        val media = if (quantidade > 0) soma / quantidade else 0.0

        i = v1
        while (i <= v2) {
            println(i)
            i += 1
            Thread.sleep(200)
        }

          println("A média aritmética é: $media")

    }
       else{println("Erro: O primeiro número deve ser menor que o segundo número.")}


}