package String;

import java.util.*;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 *
 *
 * 判断给的字符串中的括号是否有效 级别{} > [] > ()
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        //参考自：https://blog.csdn.net/zsy112371/article/details/52623988
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.isEmpty()||stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
