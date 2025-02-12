public class Demo067 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 41, 52, 65};
        System.out.println("Array even numbers");
        for (int num  : numbers) {
            if(num % 2 == 0){
            System.out.println(num + "");
            }
        }

    }
}
