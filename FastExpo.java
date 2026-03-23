public class FastExpo {

    public static int ExpoFast(int num, int pow){
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1)!=0) {
                ans = ans *num;
            }

            num= num*num;
            pow= pow>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(ExpoFast(3, 5));
    }
}
