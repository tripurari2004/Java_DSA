public class Bitith {

    public static int getIthBit(int num, int i){
        if ((num&(1<<i))==0) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int num = 10;
        int ith_bit = 3;
        int result = getIthBit(num, ith_bit);

        if (result == 0) {
            System.out.println(ith_bit+" of "+num+" is "+result);
        }
        else{
            System.out.println(ith_bit+" bit of "+num+" is "+result);
        }
    }
}
