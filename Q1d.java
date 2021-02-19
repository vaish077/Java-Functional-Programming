import java.util.Scanner;
import java.util.function.Function;

public class Q1d {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String a1=sc.next();
        Function<String,String> f= (x)->x.toUpperCase();
        System.out.println(f.apply(a1));
        
        Function<String,String> f1=String::toUpperCase; ;
        System.out.println(f1.apply(a1));
    }

}