package interface_deligation;

public class InterfaceDelegation {

    public static void main(String[] args) {
        Employee jack = new Employee(new FastCoder(), new LovelyDesigner(),new DangerousTester());
        jack.code();
        jack.design();
        jack.test();
    }
}

interface WhoCanCode {
    void code();
}

interface WhoCanDesign {
    void design();
}

interface WhoCanTest {
    void test();
}

class Employee implements WhoCanCode, WhoCanDesign,WhoCanTest {


    private WhoCanCode whoCanCode;
    private WhoCanDesign whoCanDesign;
    private WhoCanTest whoCanTest;

    public Employee(WhoCanCode whoCanCode, WhoCanDesign whoCanDesign,WhoCanTest whoCanTest) {
        this.whoCanCode = whoCanCode;
        this.whoCanDesign = whoCanDesign;
        this.whoCanTest = whoCanTest;
    }

    @Override
    public void code() {
        whoCanCode.code();
    }

    @Override
    public void design() {
        whoCanDesign.design();
    }

    @Override
    public void test() {
        whoCanTest.test();
    }
}

class FastCoder implements WhoCanCode {

    @Override
    public void code() {
        System.out.println("Code by fast coder");
    }
}

class GoodDesigner implements WhoCanDesign {

    @Override
    public void design() {
        System.out.println("Design by good designer");
    }
}

class LovelyDesigner implements WhoCanDesign {

    @Override
    public void design() {
        System.out.println("Design by Lovely designer");
    }
}

class DangerousTester implements WhoCanTest{

    @Override
    public void test() {
        System.out.println("Testing by Dangerous Tester");

    }
}