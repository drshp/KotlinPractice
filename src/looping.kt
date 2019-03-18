fun main(args: Array<String>){

    var s=0
    var j=7

    for(i in 1..7 step 2) s+=i

    println(s)

    while (j>0)
        s-=j--

    println(s)

    //Labeled loop
    lp@ for(i in 1..6){
        for(k in 1..i) {
            print("*")
            if (k == 5)
                break@lp

        }
        println("")

    }
    do {
        println(s)
        s+=j++

    }while(j<10)

}
