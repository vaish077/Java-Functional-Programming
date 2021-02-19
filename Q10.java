import java.util.Arrays;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(21,3,32,1,5,2,6,21,56,2,1,8,9,4);
        System.out.println(numbers.stream()
                .filter(x -> x>5)
                .reduce(0,Integer::sum));
    }
}