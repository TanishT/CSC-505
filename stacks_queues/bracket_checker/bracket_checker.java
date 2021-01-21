import java.util.Stack;

/*  Reason for chosing a stack for this algorithm
    1. We decided to use a stack because for this data structure, the first value put in is also the last value out. 
    2. This way we can make sure the most recently opened brackets will also be closed first
    3. Also, this allows us to make sure the amount of each opening bracket is equal to the amount of each closing bracket
    4. Also, the stack is very efficient for our purposes since pushing and popping all occur in constant time. Therefore, our overall complexity is O(N)
*/

public class bracket_checker {
    public static boolean isBalanced(String in) {
        char[] array = in.toCharArray(); 
        Stack<Character> stack = new Stack<Character>();
        if (array.length == 0) {
            //checking if empty string was passed in 
            return false;
        }
        for (char i : array) {
            if (i == '{' || i == '[' || i == '(' || i == '<') {
                //found opening character
                stack.push(i);
            }
            if (stack.isEmpty()){
                //different amount of opening and closing characters
                return false;
            }
            if (i == '}' || i == ']' || i == ')' || i == '>') {
                //found a closing character, now need to check to see if it matches 
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
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = ""; 
        System.out.println(isBalanced(str));
    }
}