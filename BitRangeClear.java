public class BitRangeClear {

    public static int clearRangeBit(int n, int i, int j){
        int a  = -1<<j+1;
        int b = (1<<i)-1;

        return n & (a|b);
    }

    public static void main(String[] args) {
        System.out.print(clearRangeBit(10, 2, 4));
    }
}
