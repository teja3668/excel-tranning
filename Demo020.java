import java.util.Scanner;

public class Demo020 {  

    public static String getFizzBizz(int num) {
        if (num <= 0) {
            return "Error";
        }

        if (num % 3 == 0 && num % 5 == 0) {
            return "FIZZBIZZ";
        }
        if (num % 3 == 0) {
            return "FIZZ";
        }
        if (num % 5 == 0) {
            return "BIZZ";
        }

        return String.valueOf(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        System.out.println(getFizzBizz(input));
        scanner.close();
}
}