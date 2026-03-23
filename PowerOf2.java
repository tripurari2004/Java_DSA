public class PowerOf2 {

    public static boolean powerOfTwo(int num){
        return (num & (num-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.print(powerOfTwo(4));
    }
}
