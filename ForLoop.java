import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        //print square * pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //print reverse of number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0;

        while(num>0){
            int lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num = num/10;
        }

        System.out.println("Reverse of num is "+reverse);

    }
}
