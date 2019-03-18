fun main(args: Array<String>){
    var x=10

    var str= when(x){
        !in 1..8 -> "in range"
        else -> "u suck"
    }
    println(str)

}