import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());

        String firstName = "Tripurari";
        String lastName = "Kumar";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName.charAt(0));

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
