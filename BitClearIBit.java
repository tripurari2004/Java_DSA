public class BitClearIBit {

    public static int clearLastBit(int n, int i){
        return (n & ((-1)<<i));
    }

    public static void main(String[] args) {
        System.out.print(clearLastBit(15, 2));
    }
}
