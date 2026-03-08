import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();

        //first half
        for (int i = 1; i <= a; i++) {

            //spaces
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //second half
        for (int i = a; i >= 1; i--) {

            //spaces
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
