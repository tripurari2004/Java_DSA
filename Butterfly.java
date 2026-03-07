import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();

        // First half of butterfly
        for (int i = 1; i <= a; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in middle
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print("  ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second half of butterfly
        for (int i = a; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in middle
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print("  ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}