import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Create a stream of strings
    Stream<String> stringStream = Stream.of("apple", "banana", "cherry");

    // Create a Consumer that prints a string to the console
    Consumer<String> printConsumer = (str) -> System.out.println(str);

    // Use the forEach method and the Consumer to print each string in the stream
    stringStream.forEach(printConsumer);
  }
}
