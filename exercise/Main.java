import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the list of strings from the user
    System.out.println("Enter a list of strings, separated by commas:");
    String input = scanner.nextLine();
    List<String> strings = Arrays.asList(input.split(","));

    // TODO: Use the map and flatMap methods to transform the list of strings

  }
}
