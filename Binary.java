public class Binary {
    public static void main(String[] args){
        int number = 10;
        int number2 = 5;

        int binarySum = number|number2;
        System.out.println("Binary Sum: " + binarySum);

        byte a = (byte)130;
        byte b = 127;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        byte binarySum2 = (byte)(a|b);
        System.out.println("Binary Sum 2: " + binarySum2);
    }
}
