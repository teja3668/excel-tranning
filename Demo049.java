
import java.util.Scanner;

public class Demo050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        System.out.println("The reverse of the number " + number + " is " + reversedNumber + ".");
        scanner.close();
    }
}
