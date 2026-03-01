import java.util.Scanner;

public class NumberProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do{
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // if (num%10==0) {
        // break;
        // }
        // System.out.println(num);
        // }while(true);

        // do{
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // if(num%10==0){
        // continue;
        // }
        // System.out.println(num);

        // }while(true);

        // check number is prime or not
        long num = sc.nextLong();
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }


        
    }
}
