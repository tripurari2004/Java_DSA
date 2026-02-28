public class DataTypes {
    public static void main(String[] args){
        // Primitive Data Types
        int age = 25; // Integer
        double price = 19.99; // Double
        char grade = 'A'; // Character
        boolean isStudent = true; // Boolean
        float height = 5.9f; // Float
        long population = 7800000000L; // Long
        byte smallNumber = 100; // Byte
        short mediumNumber = 10000; // Short

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Height: " + height);
        System.out.println("Population: " + population);
        System.out.println("Small Number: " + smallNumber);
        System.out.println("Medium Number: " + mediumNumber);


        // Non-Primitive Data Types
        String name = "Tripurari Kumar"; // String
        int[] numbers = {1, 2, 3, 4, 5}; // Array
        System.out.println("Name: " + name);
        System.out.print("Numbers: ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();


        // Implicit and Explicit Type Casting
        int myInt = 9;
        double myDouble = myInt; // Implicit casting
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);

        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Explicit casting
        System.out.println("anotherDouble: " + anotherDouble);
        System.out.println("anotherInt: " + anotherInt);


    }
}
