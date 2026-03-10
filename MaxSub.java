public class MaxSub {

    public static void MaxSumSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int curr = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    curr += arr[j2];
                    
                }
                if (maxSum<curr) {
                    maxSum = curr;
                }
            }
        }

        System.out.println("Max Sum: "+maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        MaxSumSubArray(arr);
    }
}
