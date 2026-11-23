import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = x / y;
            System.out.println(x + " / " + y + " = " + result);
        } catch (ArithmeticException ex) {
           System.out.println("--- Catch Block ---");
           System.out.println(ex.toString());
        } finally {
            System.out.println("--- Finally Block ---");
            System.out.println("Application Designed & Developed by:");
            System.out.println("Name: Roahan @ codingal");
            sc.close();
        }
        System.out.println("--- DONE ---");
    }
}