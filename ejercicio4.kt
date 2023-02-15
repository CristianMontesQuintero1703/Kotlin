//ingresar la cantidad de personas que se encuentran en un supermercado. debido a la pandemia, el aforo 
//permitido es del 40% y su totalidad es del 200. el programa debera indicar  si el aforo es aceptable, 
//esta a tope o ha sido sobrepasado
fun main(){
    val aforo = 200
    println("ingrese la cantidad de personas en el local")
    val personas = readLine()!!. toInt()

    when {
        aforo * 0.4 > personas -> println(" el aforo es aceptable")
        aforo * 0.4 == personas.toDouble() -> println("el aforo esta a tope")
        aforo * 0.4 < personas  ->  println("el aforo ha sido sobre pasado")
    }

}