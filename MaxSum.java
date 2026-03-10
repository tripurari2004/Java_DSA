public class MaxSum {

    public static void SubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.print("Max sum: "+maxSum);

    }

    public static void main(String[] args) {
       int arr[] = {1, -2, 6, -1, 3};
       SubArraySum(arr);
    }
}
