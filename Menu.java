import java.util.Scanner;

public class Menu {
    public static int foodSearch(String menu[], String food){
        for (int i = 0; i < menu.length; i++) {
            if(food.equalsIgnoreCase(menu[i])){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"Dosa", "Samosa", "Coffee", "Tea", "Icecream", "Water"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the food name: ");
        String food = sc.nextLine();

        int num = foodSearch(menu, food);

        if (num == -1) {
            System.out.println("Sorry! The enter food is currently not in menu");
        }else{
            System.out.println("Wow! The enter food "+food+" is found on index : "+num);
        }


    }
}
