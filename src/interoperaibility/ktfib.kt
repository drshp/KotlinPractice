package interoperaibility

import interoperaibility.javfun.fib
//import javfun.fib

fun main(args: Array<String>){
    fib(7)
}
@JvmOverloads
fun deffunvol(l:Int,b:Int,h:Int=6):Int{
    return l*b*h
}