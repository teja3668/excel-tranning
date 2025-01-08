public class PS002 {
    public static int getNextMultipleOf100(int value) {
        if (value <= 0) {
            return -1;
        }

        int nextMultiple = ((value / 100) + 1) * 100;
        return nextMultiple;
    }

    public static void main(String[] args) {
        int[] inputs = {899, 100, 1230, -5, 0};

        for (int num : inputs) {
            int result = getNextMultipleOf100(num);
            System.out.println("Input: " + num + " -> Output: " + result);
        }
    }
}