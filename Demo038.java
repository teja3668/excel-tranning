import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character (Infosys loves characters!): ");
        char character = scanner.next().charAt(0);  

        if (Character.isUpperCase(character)) {
            System.out.println("The character '" + character + "' is uppercase.");
        } else if (Character.isLowerCase(character)) {
            System.out.println("The character '" + character + "' is lowercase.");
        } else {
            System.out.println("The character '" + character + "' is neither uppercase nor lowercase.");
        }

        scanner.close();
    }
}
