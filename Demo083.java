import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        int vowelsCount = 0;
        int consonantsCount = 0;

        
        input = input.toLowerCase();

        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            
            if (Character.isAlphabetic(ch)) {
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                   
                    consonantsCount++;
                }
            }
        }

        
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
    }
}
