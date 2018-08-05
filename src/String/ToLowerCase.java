package String;

/**
 * Implement function ToLowerCase() that has a string parameter str,
 * and returns the same string in lowercase.
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 * A ASCII  65
 * a ASCII  97
 */

public class ToLowerCase {

    public static void main(String[] args) {
       // String hello="Hello";
        String here="here";
        String LOVELY="LOVELY";
        String reverseStr = toLoawCase(LOVELY);
        System.out.println(reverseStr);

    }

    public static String toLoawCase(String str){
        char[] charsArray = str.toCharArray();
        for(int i=0;i<charsArray.length;i++){
            //A~Z
            if(charsArray[i]<='Z'&&charsArray[i]>='A'){
                charsArray[i]+=32;
            }
        }
        return new String(charsArray);
    }
}
