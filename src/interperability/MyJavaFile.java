package interperability;

public class MyJavaFile {
    public static void main(String[] args){
       int sum =  MyNewClass.add(2,9);
        System.out.println("Sum is "+sum);
    }

    public static int getArea(int l, int w){
        return l*w;
    }
}
