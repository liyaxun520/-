class demo2 {
    class Greeter(val name:String){
        fun greet(){
            println("Hello,${name}")
        }
    }
}

fun main() {
    demo2.Greeter("lison").greet()

    for(i in 1..10){
        println("==============$i")
    }


    for (i in 1 until 10){
        println("=======xxxx=======$i")
    }
}