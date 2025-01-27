import java.util.Scanner;
public class Demo008 {    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Set up your account");
    
            System.out.print("Enter your desired username: ");
            String desiredUsername = scanner.nextLine();
    
            System.out.print("Enter your desired password: ");
            String desiredPassword = scanner.nextLine();
    
            System.out.println("\nYour account has been set up successfully!\n");
    
            boolean loggedIn = false;
    
            do {
                System.out.print("Enter Username: ");
                String enteredUsername = scanner.nextLine();
    
                System.out.print("Enter Password: ");
                String enteredPassword = scanner.nextLine();
    
                if (desiredUsername.equals(enteredUsername) && desiredPassword.equals(enteredPassword)) {
                    System.out.println("\nLogined Successful!");
                    System.out.println("Welcome to mallaredyuniversity, " + enteredUsername + "!");
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
            } while (!loggedIn);
    
            scanner.close();
        }
    
}
