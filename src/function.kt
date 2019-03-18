import kotlin.math.max

fun main(args: Array<String>){
    var n=7

    fib(n)
    println("the max value is ${max(2.0,3.4)}")

}
fun fib(n:Int){
    var s=0
    for(i in 2..n){
        s=s+i+i-1
        print("$s-> ")
    }
    println("")

    //Functions as expressions
}
fun max(a: Float,b: Float) =if(a>b) a else b
