interface myInterface1{
    void method3(String str);  
    default void method1(){
        System.out.println("Default method");   
    }
    static void method2(){                     
        System.out.println("Static method");
    }
}

public class Q7 implements myInterface1{

    public void method3(String str) {
        System.out.println(str);
    }
    public void method1(){
        System.out.println("Overriding default method");
    }
    public static void main(String...args){
        Q7 obj = new Q7();
        obj.method1();
        myInterface.method2();
        obj.method3("abstract method");
    }
}