package generics

open class Food
open class FastFood : Food()
open class Burger : FastFood()

interface Production<out T> { //If your generic class only use the generic type as output of it’s function/s, then "out" is used.
    fun produce(): T

}
class FoodStore : Production<Food>{
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}
class FastFoodStore : Production<FastFood>{
    override fun produce(): FastFood {
        println("Produce fast food")
        return FastFood()
    }

}

class BurgerStore : Production<Burger>{
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }

}

fun main() {
    //For 'out' generic, we could assign a class of subtype to class of super-type
    var production1 : Production<Food> = FoodStore()
    var production2 : Production<Food> = FastFoodStore()
    var production3 : Production<Food> = BurgerStore()

//If we change to below, it would error out, because food or fastFood is not just a burger production.
//    val production1 : Production<Burger> = FoodStore()  // Error
//    val production2 : Production<Burger> = FastFoodStore()  // Error
//    val production3 : Production<Burger> = BurgerStore()








    //For ‘in' generic, we could assign a class of super-type to class of subtype
    var consumer1 : Consumer<Burger> = EveryBody()
    var consumer2 : Consumer<Burger> = ModernPeople()
    var consumer3 : Consumer<Burger> = American()

    //If we change to below, it would error out, because consumer of Food although could be American or ModernPeople,
    // it is not just American or just ModernPeople.
//    val consumer1 : Consumer<Food> = EveryBody()
//    val consumer2 : Consumer<Food> = ModernPeople()  // Error
//    val consumer3 : Consumer<Food> = American()  // Error
}

interface Consumer<in T> {
    fun consume(item: T)
}

class EveryBody : Consumer<Food>{
    override fun consume(item: Food) {
        println("Everybody eat food")

    }

}
class ModernPeople : Consumer<FastFood>{
    override fun consume(item: FastFood) {

        println("Modern people eat fast food")

    }

}
class American : Consumer<Burger>{
    override fun consume(item: Burger) {
        println("American eat burger")

    }

}