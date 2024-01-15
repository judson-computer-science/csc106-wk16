import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // create a predicate that tests if a number is even
    Predicate<Integer> evenPredicate = (n) -> n % 2 == 0;

    // use the predicate with the filter method of the stream
    List<Integer> evenNumbers = list.stream()
        .filter(evenPredicate)
        .collect(Collectors.toList());

    System.out.println(evenNumbers);  // prints [2, 4, 6, 8, 10]
  }
}

