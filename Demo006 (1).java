import java.util.Scanner;

public class Demo006 {
    private static final String USERNAME = "prasnunamba";
    private static final String PASSWORD = "prasunambha123";

    private static boolean checkCredentials(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }

    private static void showHomePage() {
        System.out.println("\nhello prasunamba");
        System.out.println("Welcome to mallareddyuniversity");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (checkCredentials(username, password)) {
                System.out.println("\nLogin Successful!");
                showHomePage();
                loggedIn = true;
            } else {
                System.out.println("\nInvalid Username or Password.");
                System.out.print("Do you want to try again? (yes/no): ");
                String retry = scanner.nextLine().trim().toLowerCase();
                if (!retry.equals("yes")) {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }
            }
        }

        scanner.close();
    }
}
