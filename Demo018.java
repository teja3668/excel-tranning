import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();


        long minutesPerHour = 60;
        long hoursPerDay = 24;
        long daysPerYear = 365;

        long totalDays = minutes / (minutesPerHour * hoursPerDay);
        long years = totalDays / daysPerYear;
        long remainingDays = totalDays % daysPerYear;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
        scanner.close();
    }
}
