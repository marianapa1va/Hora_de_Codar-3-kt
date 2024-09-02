fun main (){
    //Bomba relógio de 0 á 30

    var contagem = 30

    while (contagem > 0){

    println("Contagem regressiva: $contagem")
        contagem = contagem -1
        Thread.sleep(500)
    }
     println("EXPLOSÃO!!!!")

}
