package Mix;

import java.util.Stack;

public class Hd {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(56);
        stack.push(256);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
