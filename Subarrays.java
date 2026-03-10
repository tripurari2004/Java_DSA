public class Subarrays {
    public static void subArrays(int arr[]){
        
        for (int i = 0; i < arr.length-1; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int last = j;
                for (int k = start; k < last; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4 , 6, 8, 10, 12, 14};
        subArrays(arr);
    }
}
