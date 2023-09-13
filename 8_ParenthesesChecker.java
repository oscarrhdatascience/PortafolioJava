import java.util.Stack;

public class ParenthesesChecker {
    
    public static boolean are_parentheses_balanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char chara : expression.toCharArray()) {
            if (chara == '(') {
                stack.push(chara);
            } else if (chara == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(are_parentheses_balanced("(())()"));  // True
        System.out.println(are_parentheses_balanced(")("));  // False
    }
}
