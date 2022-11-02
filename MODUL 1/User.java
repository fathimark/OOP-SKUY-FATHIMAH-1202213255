
import java.util.Scanner;
public class User {

    public void user_info() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name : " );
        String nama = input.nextLine();

        System.out.println("No handphone : ");
        Integer nomor = input.nextInt();

        input.close();

        System.out.println("Register Success");
        System.out.println("Name: " + nama);
        System.out.println("Phone Number: " + nomor);

        
    }

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
