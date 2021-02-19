import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Q1c {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String a1=sc.next();
        System.out.println("Enter String:");
        String a2=sc.next();
        BiFunction<String,String,String> f= (x,y)->x+y;
        System.out.println(f.apply(a1,a2));

        BiConsumer<String, String> f1 = (value1, value2) ->
            System.out.println(value1+" "+value2);

        f1.accept(a1, a2);
    }

}