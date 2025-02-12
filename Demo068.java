public class Demo068 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 41, 52, 65};
       int count = 0;
        for (int num  : numbers) {
            if(num % 2 == 0){
            count++;
            }
        }
        System.out.println("count of even numbers in the array: "+count);

    }
}
