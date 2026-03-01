public class Operator {
    public static void main(String[] args){
        int number = 10;
        int number2 = 5;

        int sum = number + number2;
        System.out.println("Sum: " + sum);

        int difference = number - number2;
        System.out.println("Difference: " + difference);

        int product = number * number2;
        System.out.println("Product: " + product);

        int quotient = number / number2;
        System.out.println("Quotient: " + quotient);

        int remainder = number % number2;
        System.out.println("Remainder: " + remainder);


        //Assignment Operators
        int x = 10;
        x += 5; // x = x + 5
        System.out.println("x after += 5: " + x);

        x -= 3; // x = x - 3
        System.out.println("x after -= 3: " + x);

        x *= 2; // x = x * 2
        System.out.println("x after *= 2: " + x);

        x /= 4; // x = x / 4
        System.out.println("x after /= 4: " + x);

        x %= 3; // x = x % 3
        System.out.println("x after %= 3: " + x);


        //Relational Operators
        int a = 10;
        int b = 20;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        //Logical Operators
        boolean condition1 = true;
        boolean condition2 = false; 
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));


        //Bitwise Operators
        int num1 = 5; // 0101 in binary
        int num2 = 3; // 0011 in binary
        System.out.println("num1 & num2: " + (num1 & num2)); // 0001 in binary
        System.out.println("num1 | num2: " + (num1 | num2)); // 0111 in binary
        System.out.println("num1 ^ num2: " + (num1 ^ num2)); // 0110 in binary
        System.out.println("~num1: " + (~num1)); // 1010 in binary (two's complement representation)

        //Shift Operators
        int shiftNum = 8; // 1000 in binary
        System.out.println("shiftNum << 1: " + (shiftNum << 1)); // 10000 in binary
        System.out.println("shiftNum >> 1: " + (shiftNum >> 1)); // 0100 in binary
        System.out.println("shiftNum >>> 1: " + (shiftNum >>> 1)); // 0100 in binary (unsigned right shift)


        //Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result: " + result);


        //Increment and Decrement Operators
        int count = 0;
        System.out.println("Count: " + count); // 0
        count++; // Post-increment
        System.out.println("Count after post-increment: " + count); // 1
        ++count; // Pre-increment
        System.out.println("Count after pre-increment: " + count); // 2


        count--; // Post-decrement
        System.out.println("Count after post-decrement: " + count); // 1
        --count; // Pre-decrement
        System.out.println("Count after pre-decrement: " + count); // 0


    }
}
