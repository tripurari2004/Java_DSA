public class Kadane {

    public static void MaxSum(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.print("Max Subarry sum is : "+ ms);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        MaxSum(arr);
    }
}
