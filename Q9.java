import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        List<Integer> EvenNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18);

        System.out.println("Even Numbers are :");
        EvenNum.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}