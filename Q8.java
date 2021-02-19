interface myInterface2{
    void method3(String str);  
    default void method1(){
        System.out.println("Default method of myInterface2");   
    }
    static void method2(){                    
        System.out.println("Static method of myInterface2");
    }
}

interface myInterface3{
    void method(String str);  
    default void method1(){
        System.out.println("Default method of myInterface3");   
    }
    static void method2(){                     
        System.out.println("Static method of myInterface3");
    }
}

public class Q8 implements myInterface2,myInterface3{
    public void method(String str) {
        System.out.println(str);
    }
    public void method3(String str) {
        System.out.println(str);
    }
    public void method1(){
        System.out.println("Overriding default method");
    }
    public static void main(String...args){
        Q8 obj=new Q8();
        obj.method1();
        myInterface3.method2();
        myInterface2.method2();
        obj.method3("abstract method3");
        obj.method("abstract method");
    }
}