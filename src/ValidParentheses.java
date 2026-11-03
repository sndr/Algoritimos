package src;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;

                char topo = stack.peek();
                if ((c == ')' && topo == '(') ||
                        (c == ']' && topo == '[') ||
                        (c == '}' && topo == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
