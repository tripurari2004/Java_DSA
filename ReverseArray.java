public class ReverseArray {

    public static void reverseArray(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while (first<last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 4 , 6, 8, 10, 12, 14};
        reverseArray(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
}
