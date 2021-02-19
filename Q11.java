import java.util.List;

public class Q11{

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,8,4,5,2,6,3,5,2);
		System.out.println(numbers.stream().mapToInt(x->x+x).peek(System.out::println).average());
		
	}

}