import java.util.HashSet;
public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 4, 1, 3};

        findDuplicates(array);
    }
    public static void findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        System.out.println("Duplicate elements: " + duplicates);
    }
}