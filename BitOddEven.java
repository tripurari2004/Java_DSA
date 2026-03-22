public class BitOddEven {

    public static void checkEvenOdd(int num){
        if ((num&1)==0){
            System.out.println(num+" number is an Even Number");
        }else{
            System.out.println(num+" number is an Odd Number");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(11);
        checkEvenOdd(14);
        checkEvenOdd(17);
        checkEvenOdd(8);
    }
}
