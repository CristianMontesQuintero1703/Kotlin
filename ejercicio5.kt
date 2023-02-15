//haga un algoritmo que solicite 2 numeros, valide cual es mayor o si son iguales
fun main (){
    println("ingrese el primer numero")
    var num1 = readLine()!!. toInt()
    println("ingrese el segundo numero")
    var num2 = readLine()!!. toInt()

    if(num1>num2){
        println("el numero $num1 es mayor a $num2")
    }else if(num2>num1){
        println("el numero $num2 es mayor a $num1")
    }else{
        println("los numeros son iguales")
    }

}