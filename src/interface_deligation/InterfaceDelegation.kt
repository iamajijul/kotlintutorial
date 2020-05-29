package interface_deligation


fun main() {
    val jack = Employee(FastCoder(),GoodDesigner(), GoodTester())
    jack.code()
    jack.design()
    jack.test()
}

internal interface WhoCanCode {
    fun code()
}

internal interface WhoCanDesign {
    fun design()
}

internal interface WhoCanTest {
    fun test()
}

internal class FastCoder : WhoCanCode {
    override fun code() {
        println("Code by fast coder")
    }
}

internal class GoodDesigner : WhoCanDesign {
    override fun design() {
        println("Design by good designer")
    }
}

internal class DangerousTester : WhoCanTest {
    override fun test() {
        println("Testing by Dangerous Tester")
    }
}
internal class GoodTester : WhoCanTest {
    override fun test() {
        println("Testing by Good Tester")
    }
}

internal class Employee(code: WhoCanCode,design: WhoCanDesign,tester: WhoCanTest) : WhoCanCode by code,WhoCanDesign by design,WhoCanTest by tester{

}