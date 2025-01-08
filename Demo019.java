import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        int nearestMultiple = Math.round(number / 5.0f) * 5;

        System.out.println("The nearest multiple of 5 to " + number + " is " + nearestMultiple);
    }
}

