import java.util.Scanner;

public class Demo036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (Infosys): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (Capgemini): ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Infosys has the largest number: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Capgemini has the largest number: " + num2);
        } else {
            System.out.println("The third number is the largest: " + num3);
        }

        
        scanner.close();
    }
}
