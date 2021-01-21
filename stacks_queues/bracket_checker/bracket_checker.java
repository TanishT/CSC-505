import java.util.Stack;

public class bracket_checker {
    public static boolean isBalanced(String in) {
        char[] array = in.toCharArray(); 
        Stack<Character> stack = new Stack<Character>();
        for (char i : array) {
            if (i == '{' || i == '[' || i == '(' || i == '<') {
                stack.push(i);
            }
            if (stack.isEmpty()){
                return false;
            }
            if (i == '}' || i == ']' || i == ')' || i == '>') {
                char top = stack.pop();
                if (top == '{' && i != '}') {
                    return false;
                } else if (top == '[' && i != ']') {
                    return false;
                } else if (top == '(' && i != ')') {
                    return false;
                } else if (top == '<' && i != '>') {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "{[()()]}";
        System.out.println(isBalanced(str));
    }
}