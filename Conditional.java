import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //Conditional Statements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }


        System.out.print("Enter a number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter a number3: ");
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The largest number is: " + max);


        //Nested If Statements
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }


        //Logical Operators in Conditional Statements
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        if (number1 > 0 && number1 % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (number1 > 0 && number1 % 2 != 0) {
            System.out.println("The number is positive and odd.");
        } else if (number1 < 0 && number1 % 2 == 0) {
            System.out.println("The number is negative and even.");
        } else if (number1 < 0 && number1 % 2 != 0) {
            System.out.println("The number is negative and odd.");
        } else {
            System.out.println("The number is zero.");
        }


        //Ternary Operator
        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        String result = (number2 % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);


        //Switch Statement
        System.out.print("Enter a grade (A-F): ");
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            case 'D':
                System.out.println("You need to improve.");
                break;
            case 'F':
                System.out.println("You failed.");
                break;
            default:
                System.out.println("Invalid grade.");
        }


        //Close the scanner
        scanner.close();
    }
}
