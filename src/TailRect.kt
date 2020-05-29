import java.math.BigInteger

fun main(args : Array<String>){

   print(getFibonacciNumber(5, BigInteger("1"),BigInteger("0")))
   print(getFibonacciNumber(10000, BigInteger("1"),BigInteger("0")))//without tailrect keyword, compiler giving stackoverflow exception
   //print(getFibonacciNumber(10000, BigInteger("1"),BigInteger("0")))
}

//0,1,1,2,3,5,8,13,21... Fibonacci Series

tailrec fun getFibonacciNumber(n : Int,a: BigInteger,b:BigInteger):BigInteger{
    if(n==0)
        return b
    else return getFibonacciNumber(n-1,a+b,a )
}