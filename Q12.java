import java.util.List;
public class Q12{
     public static void main(String[] args) {
		List<Integer> numbers = List.of(1,4,8,5,2,6,3,5,2);
		System.out.println("First Even Element which is greater than 3 is :"+numbers.stream().filter(x->x%2==0).findFirst());
	}
}
