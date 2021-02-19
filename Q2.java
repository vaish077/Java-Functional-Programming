import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Q2{
public static void main(String...args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no:");
    int a=sc.nextInt();
    System.out.println("Enter no:");
    int b=sc.nextInt();
    BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {
        public Integer apply(Integer integer, Integer integer2) {
            return integer+integer2;
        }
    };
    System.out.println(binaryOperator.apply(a,b));
}
}