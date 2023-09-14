public class CheckEvenOdd {
    public static String is_even(int n) {
        if (n % 2 == 0) {
            return "The number is even";
        } else {
            return "The number is odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(is_even(4));  
    }
}
