public class Demo069 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            
            int sum = calculateSum(array);
            System.out.println("Sum of all elements: " + sum);
        }
        
        public static int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }
    }

