import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Create a Supplier that returns a random integer
    Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);

    // Use the Supplier with Stream.generate to create an infinite Stream of random ints
    Stream<Integer> randomIntStream = Stream.generate(randomIntSupplier);

    // Print the first 10 random ints in the Stream
    randomIntStream.limit(10).forEach(System.out::println);
  }
}
