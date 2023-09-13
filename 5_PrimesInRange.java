import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersInRange {
    
    public static boolean is_prime(int num) {
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

    public static List<Integer> find_primes_in_range(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (is_prime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(find_primes_in_range(10, 50));  // Output: [11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
    }
}
