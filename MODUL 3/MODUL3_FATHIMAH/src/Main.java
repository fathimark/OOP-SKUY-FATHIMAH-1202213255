import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {

        Calculation calc1 = new Calculation();
        Thread thread = new Thread(calc1);
        Scanner input = new Scanner(System.in);

        boolean repeat = true;

        do {
            System.out.println("\nMenu Program");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            try {
                System.out.print("Select menu : ");
                int menu = input.nextInt();
                System.out.println();

                switch (menu) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = input.nextDouble();
                        calc1.setSquare(side);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + calc1.getSquare());

                        break;

                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double rad = input.nextDouble();
                        calc1.setCircle(rad);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + calc1.getCircle());

                        break;

                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid : ");
                        double base = input.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double upper = input.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double height = input.nextDouble();
                        calc1.setTrapezoid(base, upper, height);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + calc1.getTrapezoid());
                        break;

                    case 0:
                        System.out.println("The program is finished");

                    default:
                        System.out.println("\nOptions not available\n");

                        continue;
                }
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("\nError: Input must be a number\n");
                input.next();
            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e);
                System.out.println();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } while (repeat);
        input.close();
    }
}
