import java.util.Scanner;
public class Demo009 {
        private String name;
        private int accnumber;
        private String balance;
    
        public void acceptDetails() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter customer name: ");
            name = scanner.nextLine();
    
            System.out.print("Enter BankAcount number: ");
            accnumber = scanner.nextInt();
            scanner.nextLine(); 
    
            System.out.print("Enter the balance: ");
            balance = scanner.nextLine();
        }
    
        public void displayDetails() {
            System.out.println("\nDetails:");
            System.out.println("Name: " + name);
            System.out.println("acc number: " + accnumber);
            System.out.println("balance: " + balance);
        }
    
        public static void main(String[] args) {
            Demo9 person = new Demo9();
            person.acceptDetails();
            person.displayDetails();
        }
    
    
}
