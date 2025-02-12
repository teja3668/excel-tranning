public class Demo071 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            
            reverseArray(array);
            
            System.out.print("Reversed array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
        
        public static void reverseArray(int[] array) {
            int left = 0, right = array.length - 1;
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }

    }
}
