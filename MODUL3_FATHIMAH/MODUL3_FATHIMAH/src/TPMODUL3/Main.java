package TPMODUL3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant1 = new Restaurant();
        int customerID, orderQty;

    try{
        System.out.print("Enter Cust ID : ");
        customerID = input.nextInt();

        System.out.print("Enter how much food to make : ");
        orderQty = input.nextInt();

        Thread thread1 = new Thread(restaurant1);
        Waiters waiters = new Waiters(orderQty, customerID);
        Thread thread2 = new Thread(waiters);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    } catch(Exception e){
        System.out.println("Input must be integer");

    }

    input.close();
}

}