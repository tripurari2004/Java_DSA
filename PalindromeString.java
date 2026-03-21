import java.util.Scanner;

public class PalindromeString {

    public static boolean Plaindrome(String word){
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
           reverse = reverse + word.charAt(i);
        }

        return word.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print(Plaindrome(word));
    }
}
