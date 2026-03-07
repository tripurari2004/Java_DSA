import java.util.Scanner;

public class invertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {

            // hollow pattern
            for (int j = i; j <=a-1; j++) {
                System.out.print("  ");
            }

             //star pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
