import java.util.Scanner;
import java.util.function.BiFunction;

class demo{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
}


public class Q3 {
    public static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        System.out.println("Enter no:");
        int b=sc.nextInt();
        BiFunction<Integer,Integer,Integer> add=new demo()::add;
        BiFunction<Integer,Integer,Integer> subtract=new demo()::subtract;
        BiFunction<Integer,Integer,Integer> multiply=ques3::multiply;
        System.out.println(add.apply(a,b));
        System.out.println(subtract.apply(a,b));
        System.out.println(multiply.apply(a,b));
    }
}