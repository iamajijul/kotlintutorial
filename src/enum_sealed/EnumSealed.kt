package enum_sealed

private enum class Mobile(){
    APPLE(100),NOKIA(90),SAMSUNG(90),HTC(70);
    var price :Int?=0
    constructor(price : Int){
        this.price=price
        println("constructor $name price is ${this.price} dollar")
    }
}

fun main() {
    println(Mobile.APPLE.price)
}