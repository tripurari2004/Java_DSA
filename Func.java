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

    public static void main(String[] args) {
        // helloWorld();
        // helloWorld();
        // helloWorld();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }
}
