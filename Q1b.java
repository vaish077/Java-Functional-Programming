import java.util.Scanner;
import java.util.function.Function;

public class Q1b {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        Function<Integer,Integer> f=x->x+1;
        System.out.println(f.apply(a));
    }
}