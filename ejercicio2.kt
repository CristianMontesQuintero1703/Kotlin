fun main(){
    println("nota 1")
    var nota1= readLine()!!.toFloat()
    println("nota 2")
    var nota2= readLine()!!.toFloat()
    println("nota 3")
    var nota3= readLine()!!.toFloat()
    var promedio=(nota1+nota2+nota3)/3
    if(promedio>3.5){
        println("gana la materia")
    }else if(promedio> 2.5){
        println("puede recuperar")
    }else{
        println("pierde la materia")
    }
}