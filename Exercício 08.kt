fun main(){
    //O programa irá ler um valor N e imprimir todos os valores inteiros entre 1 e N.

    print("Informe um valor: ")
    var v1 = readln().toDouble()

    for ( valor in 1 until v1.toInt()){

        Thread.sleep(200)

        println("Contagem - $valor")

    }
}