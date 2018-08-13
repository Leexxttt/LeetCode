package String;

/**
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 * 字符串翻转
 */
public class ReverseString {

    public static String reverseString(String s) {
        char[] chars = new char[s.length()];
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            chars[i]=s.charAt(j);
            j++;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("amanaP :lanac a ,nalp a ,nam A"));
    }
}
