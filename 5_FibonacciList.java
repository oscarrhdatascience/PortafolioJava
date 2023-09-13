import java.util.ArrayList;
import java.util.List;

public class FibonacciList {
    public static List<Integer> fibonacci(int n) {
        List<Integer> fib_sequence = new ArrayList<>();
        fib_sequence.add(0);
        fib_sequence.add(1);
        while (fib_sequence.size() < n) {
            fib_sequence.add(fib_sequence.get(fib_sequence.size() - 1) + fib_sequence.get(fib_sequence.size() - 2));
        }
        return fib_sequence;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));  // Output: [0, 1, 1, 2, 3]
    }
}
