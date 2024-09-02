fun main(){
    // Tabuada

    var num : Int
    var i : Int

    print("Informe o número da tabuada desejada: ")
    num = readln().toDouble().toInt()

    for (i in 1 until 10){

        println("$num x $i = ${num * i}")
    }
}