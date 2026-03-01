import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.println("You entered: " + number);

        //Close the scanner
        scanner.close();
    }
}
