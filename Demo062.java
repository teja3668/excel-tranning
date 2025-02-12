public class Demo062 {
    public static boolean isPrime(int num) {
        if(num<2) {
            return false;

        }
        for(int i = 2; i <=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        System.out.println("prime numbers from 1 to 10:");
        while(num <=  10){
            if(isPrime(num)){
                System.out.println(num+"");
                count++;
            }
            num++;
        }
    }
}
