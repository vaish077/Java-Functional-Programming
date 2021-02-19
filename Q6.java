interface myInterface{
    void method3(String str);  
    default void method1(){
        System.out.println("Default method");   
    }
    static void method2(){                     
        System.out.println("Static method");
    }
}

public class Q6 implements myInterface{

    public void method3(String str) {
        System.out.println(str);
    }

    public static void main(String...args){
        Q6 obj = new Q6();
        obj.method1();
        myInterface.method2();
        obj.method3("abstract method");
    }
}