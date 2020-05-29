sealed class Expr {

    data class FloatVal(val myFloat : Float) : Expr()
    data class Sum(val exp1 : Expr,val exp2 : Expr) : Expr()
    data class Sub(val exp1 : Expr,val exp2 : Expr) : Expr()
    object NotANumber : Expr()

}
fun main(args : Array<String>){
    val number1 = Expr.FloatVal(12.0f)
    val number2 = Expr.FloatVal(10.0f)
    val sumExp = Expr.Sum(number1,number2)
    var subExp = Expr.Sub(number1,number2)
    var res1 = evaltn(sumExp)
    var res2 = evaltn(subExp)
    println(res1)
    println(res2)
}

 fun evaltn(exp: Expr) : Float = when(exp){
    is Expr.FloatVal -> exp.myFloat
    is Expr.Sum -> evaltn(exp.exp1) + evaltn(exp.exp2)
    is Expr.Sub -> evaltn(exp.exp1) - evaltn(exp.exp2)
    Expr.NotANumber -> Float.NaN
}
