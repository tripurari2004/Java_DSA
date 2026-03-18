public class Trap {

    public static int TrapWater(int arr[]){
        int leftMax [] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        int rightMax [] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }


        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-arr[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height [] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrapWater(height));
    }
}
