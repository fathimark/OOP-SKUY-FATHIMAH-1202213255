import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {


    public static void InsertMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input nama makanan 1 : " );
        String name_1 = input.nextLine();

        System.out.println("Input harga makanan 1");
        String category_1 = input.nextLine();
        
        System.out.println("Input jenis makanan 1");
        Integer price_1 = input.nextInt();
        
        System.out.println("Input nama makanan 2 : " );
        String name_2 = input.nextLine();

        System.out.println("Input harga makanan 1");
        String category_2 = input.nextLine();
        
        System.out.println("Input jenis makanan 1");
        Integer price_2 = input.nextInt();

        
        System.out.println("Input nama makanan 1 : " );
        String name_3 = input.nextLine();

        System.out.println("Input harga makanan 1");
        String category_3 = input.nextLine();
        
        System.out.println("Input jenis makanan 1");
        Integer price_3 = input.nextInt();  

        input.close();
    }

    public static void ShowMenu() {
        get.InsertMenu();
        System.out.println(name_1 + category_1 + price_1);
        System.out.println(name_2 + category_2 + price_2);
        System.out.println(name_3 + category_3 + price_3);
    }

}
