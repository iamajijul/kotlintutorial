package generics

fun main(){

    val obj = Container<Number>(1)
    obj.testOut(ArrayList<Int>())
    obj.testIn(ArrayList<Number>())

}
// "out"->
class Container<T>(var value : T){

    fun testOut(obj: ArrayList<out T>) { // called generic class is sub class which extend super class(T) <Int extend Number(T)>
        // ==(we could assign a class of subtype to class of super-type)

    }

    fun testIn(obj: ArrayList<in T>) { // called generic class is super class of sub class(T) <Number super Int(T)>
        // == (we could assign a class of super-type to class of subtype(T))

    }
}
//https://www.facebook.com/100009555330666/posts/2588743844787435/?sfnsn=wiwspwa&d=w&vh=i&extid=7MxRn7kCrMGgtyqU&d=w&vh=i