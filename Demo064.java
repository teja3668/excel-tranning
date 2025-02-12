public class Demo064 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        if (numbers.length > 1) {
            int temp =  numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1]=temp;
        }
        System.out.println("Swapping arrays  first and last elements: ");
        for(int num : numbers){
            System.out.println(num+" ");
        }
    }
}
