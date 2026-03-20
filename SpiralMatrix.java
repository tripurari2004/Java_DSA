public class SpiralMatrix {

    public static void MatrixSpiral(int arr[][]){
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;
        
        while (startRow <= endRow && startCol <= endCol) {

            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i]+" ");
            }

            for (int j = startRow+1; j <= endRow; j++) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[j][endCol]+" ");
            }

            for (int i = endCol-1; i>= startCol; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[endRow][i]+" ");
            }

            for (int j = endRow-1; j >= startRow+1; j--) {
                System.out.print(arr[j][startCol]+" ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix [][] = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};

        MatrixSpiral(matrix);
    }

}
