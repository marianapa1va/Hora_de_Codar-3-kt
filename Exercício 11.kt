fun main(){
    //O programa irá ler os 10 valores informados pelo usuário e irformará quantos desses valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.

for ( i in 1 until 10){

    println("Informe um número: ")
    var num = readln().toDouble()

    if ( num >= 24 == num <= 42 ){
        println("Está dentro deste intervalo!")
    }
    else (println("Está fora deste intervalo!"))
}

}