import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> userDetails = new HashMap<>();

        System.out.println("Enter user details:");

        System.out.print("Name (String): ");
        userDetails.put("Name", scanner.nextLine());

        System.out.print("Age (Integer): ");
        userDetails.put("Age", scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Email (String): ");
        userDetails.put("Email", scanner.nextLine());

        System.out.print("Phone Number (Long): ");
        userDetails.put("Phone", scanner.nextLong());
        scanner.nextLine(); 

        System.out.print("Height (Double): ");
        userDetails.put("Height", scanner.nextDouble());
        scanner.nextLine(); 

        System.out.println("\nUser Details:");
        for (Map.Entry<String, Object> entry : userDetails.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
