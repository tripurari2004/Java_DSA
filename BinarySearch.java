public class BinarySearch {

    public static int binarySearch(int num[], int key){
        int start = 0;
        int last = num.length;
        

        while (start<=last) {
            int middle = (start+last)/2;

            if (num[middle]==key) {
                return middle;
            }
            if (num[middle]<key) {
                start = middle+1;
            }
            if (num[middle]>key) {
                last = middle-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        
        int result = binarySearch(num, key);

        if (result == -1) {
            System.out.println("Sorry! The enter number is not found in array");
        }else{
            System.out.println("Wow! The enter number index  is : "+result);
        }

    }
}
