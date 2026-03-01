import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //While Loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        //Print 10 number using while loop
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        //Print 1 to n using for loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        int counter2 = 1;
        while (counter2 <= n){
            System.out.print(counter2 + " ");
            counter2++;
        }
        

        //print sum of first n natural numbers
        System.out.print("\nEnter a number n: ");
        int n2 = sc.nextInt();
        int sum = 0;
        int counter3 = 0;
        while(counter3 <= n2){
            sum+= counter3;
            counter3++;
        }
        System.out.println("Sum of first " + n2 + " natural numbers: " + sum);

    }
}
