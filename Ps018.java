import java.util.Scanner;

public class Ps018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        scanner.close();

        long years = minutes / (60 * 24 * 365);

        System.out.println(minutes + " minutes is approximately " + years + " years.");
    }
}

