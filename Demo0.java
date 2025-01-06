
    
import java.util.Scanner;
public class Demo0 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name");
        String name = sc.nextLine();
        System.out.println("what is your password");
        int pass =  sc.nextInt();
        System.out.println("your name :"+ name);
        System.out.println("your password :"+ pass);
       //System.out.println(" your name" : + name +"your password is :" + pass);
        sc.close();
    } 