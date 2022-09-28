import java.nio.file.Paths;
import java.util.Scanner;

public class LineSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File name? ");
        String file = scanner.nextLine();

        Number numbers = new Number();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                numbers.extractNumbers(line);
                numbers.extractHigher();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}