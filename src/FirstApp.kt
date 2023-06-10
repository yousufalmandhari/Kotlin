fun main(){

    // val for value not change
    val v = 1
    // var for variable can be changing
    var x :Int = 11

    when(x){
        1->{
            print("x = 1")
        }
        3,4,2->{
            print("x = 3,4,2")
        }
        in 5..10->{
            print("x = in 5..10")
        }
    }


    // for loops
    for (i in 1..5){
        //println("i = $i")
    }

    loop@ for (i in 1..2){
        for (ii in 1..3){
            if(ii == 2){
                break@loop
            }
        }
    }

    //println("Sum = ${sum(1.8,3.2)}")
    
}

fun sum(x :Double, y :Double):Double{
    var z :Double = x + y
    return z
}