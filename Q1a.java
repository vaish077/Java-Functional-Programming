import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Q1a{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int num1=sc.nextInt();
        System.out.println("Enter the second no.");
        int num2=sc.nextInt();

        BiFunction<Integer,Integer,Boolean> b=(x, y)->x>y;
        System.out.println(b.apply(num1,num2));

        BiPredicate<Integer,Integer> b1=(x,y)->x>y;
        System.out.println(b1.test(num1,num2));
    }
}
