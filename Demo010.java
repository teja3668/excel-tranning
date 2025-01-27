import java.util.Scanner;
class customer{
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
}
public class Demo010 {
    
        public static void main(String[] args) {
            customer person = new customer();
            person.acceptDetails();
            person.displayDetails();
        }
    
    
}
