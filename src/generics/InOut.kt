package generics

fun main(){
    val production1 : Production<Food> = FoodStore()
    val production2 : Production<Food> = FastFoodStore()
    val production3 : Production<Food> = InOutBurger()
}
open class Food
open class FastFood : Food()
class Burger : FastFood()
interface Production<out T> {
    fun produce(): T
}
interface Consumer<in T> {
    fun consume(item: T)
}

class FoodStore : Production<Food> {
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}

class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood {
        println("Produce fast food")
        return FastFood()
    }
}

class InOutBurger : Production<Burger> {
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}