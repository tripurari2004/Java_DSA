import java.util.Scanner;

public class Array {

    public static void update(int marks[], int age){
        age += 5;
        System.out.println("Print in update fuction "+age);
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        // int marks[] = new int[100];

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the physics marks: ");
        // marks[0] = sc.nextInt();
        // System.out.print("Enter the chemistry marks: ");
        // marks[1] = sc.nextInt();
        // System.out.print("Enter the maths marks: ");
        // marks[2] = sc.nextInt();

        // System.out.println("Physics : "+marks[0]);
        // System.out.println("Chemistry : "+marks[1]);
        // System.out.println("Mathematics : "+marks[2]);

        int marks[] = {97,98,99};
        int age = 21;
        update(marks, age);
        System.out.println("Print in main fuction "+age);

        for (int i : marks) {
            System.out.println(i);
        }

    }
}
