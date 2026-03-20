import java.util.Scanner;

public class MatrixSearch {

    public static boolean SearchElement(int arr[][], int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at index ( "+i+","+j+" )");
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int m = matrix.length, n = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
            
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
            
        }

        System.out.println("Enter the element that you want to search: ");
        int num = sc.nextInt();
        System.out.print(SearchElement(matrix, num));
    }
}
