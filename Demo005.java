import java.util.Scanner;

public class Demo005{
  
    private static final String USERNAME = "user001";
    private static final String PASSWORD = "User_001";

    private static boolean checkCredentials(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
    private static void showHomePage() {
        System.out.println("\nHappy new year");
        System.out.println("Welcome to new year");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        if (checkCredentials(username, password)) {
            System.out.println("\nLogin Successful!");
            showHomePage();
        } else {
            System.out.println("\nInvalid Username or Password.");
        }

        scanner.close();
    }
}