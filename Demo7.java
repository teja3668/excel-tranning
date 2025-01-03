
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("\nUser details entered:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Age: " + age);
        scanner.close();
    }
}
