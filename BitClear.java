public class BitClear {

    public static int clearBit(int num, int i){
        return (num & (~(1<<i)));
    }

    public static void main(String[] args) {
        System.out.println(clearBit(10, 1));
    }
}
