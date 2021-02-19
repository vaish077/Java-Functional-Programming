import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q5 {
public static void main(String...args){
    Consumer<String> con= System.out::println;
    con.accept("Vaishali");
    String t = "One";
    Supplier<String> supplierStr = t::toUpperCase;
    System.out.println(supplierStr.get());
    Predicate<String> startsWithA = t1 -> t1.startsWith("Q");
    boolean result = startsWithA.test("Qwerty");
    System.out.println(result);

    Function<Integer, Integer> sqr = x -> x * x;
    System.out.println(sqr.apply(5));
}
}