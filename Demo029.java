import java.util.ArrayList;
import java.util.Scanner;

class Friend {
    private String name;
    private int age;
    private String email;

    // Constructor
    public Friend(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }
}

public class Demo029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Friend> friendsList = new ArrayList<>();

        int numberOfFriends;
        do {
            System.out.println("How many friends' details do you want to enter? (Enter a number between 0 and 9)");
            numberOfFriends = scanner.nextInt();
            if (numberOfFriends < 0 || numberOfFriends > 9) {
                System.out.println("Please enter a valid number between 0 and 9.");
            }
        } while (numberOfFriends < 0 || numberOfFriends > 9);

        scanner.nextLine(); 

        for (int i = 0; i < numberOfFriends; i++) {
            System.out.println("Enter details for friend " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Email: ");
            String email = scanner.nextLine();

            
            friendsList.add(new Friend(name, age, email));
        }

        System.out.println("\nFriends' Details:");
        for (Friend friend : friendsList) {
            System.out.println(friend);
        }

        scanner.close();
    }
}
