import java.util.Scanner;

public class Func {
    //normal function
    public static void helloWorld(){
        System.out.println("Hello World!");
    }


    //parameters function
    public static int sum(int a, int b){
        return (a+b);
    }

    //swap function call by value
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }


    //multiply function
    public static int multiply(int a, int b){
        return a*b;
    }

    //factorial func
    public static int factorial(int a){
        int fact = 1;
        while (a>1) {
            fact = fact*a;
            a--;
        }

        return fact;
        
    }

    //function overloading
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static float multiply(float a, float b, float c){
        return a*b*c;
    }

    public static double multiply(double a, double b, double c){
        return a*b*c;
    }

    //prime func
    public static boolean prime(int a){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i==0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    //print prime
    public static void PrimeinRange(int a){
        for (int i = 2; i <= a; i++) {
            if (prime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //binary to decimal
    public static double ConvertDecimal(int a){
        double decimal = 0;
        int power = 0;
        while (a>0) {
            int lastDigit = a%10;
            decimal = decimal+(lastDigit*Math.pow(2, power));
            power++;
            a /=10;
        }

        return decimal;
    }

    //decimal to binary
    public static int DecimaltoBinary(int a){
        int binary = 0;
        while (a>0) {
            binary = binary*10+(a%2);
            a = a/2;
        }

        return binary;
    }

    public static void main(String[] args) {
        // helloWorld();
        // helloWorld();
        // helloWorld();

        Scanner sc = new Scanner(System.in);
        // System.out.println("**************************************************");
        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();
        // System.out.print("Enter third number: ");
        // int c = sc.nextInt();
        // System.out.println(multiply(a, b));
        // System.out.println(multiply(a, b, c));
        // System.out.println("**************************************************");
        // System.out.print("Enter first number: ");
        // float d = sc.nextInt();
        // System.out.print("Enter second number: ");
        // float e = sc.nextInt();
        // System.out.print("Enter third number: ");
        // float f = sc.nextInt();
        // System.out.println(multiply(d,e,f));
        // System.out.println("**************************************************");
        // System.out.println(sum(a, b));
        // swap(a, b);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(multiply(a, b));
        // System.out.println(factorial(a));
        // System.out.println(factorial(b));
        // System.out.print("Enter the number: ");
        // int a = sc.nextInt();
        // PrimeinRange(a);
        // System.out.print("Enter the number: ");
        // int a = sc.nextInt();
        // System.out.println("Decimal value of "+a+" is : "+ConvertDecimal(a));/
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("Binary value of "+a+" is : "+DecimaltoBinary(a));



    }
}
