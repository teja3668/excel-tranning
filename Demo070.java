public class Demo070 {
        public static void main(String[] args) {
            int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17};
            
            System.out.print("Prime numbers in the array: ");
            for (int num : array) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }
        
        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

}
