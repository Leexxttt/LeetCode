package String;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 * 统计目标字符串中第一次出现给定字符串的下标
 */
public class ImplementstrStr {

    public static int strStr(String haystack, String needle) {
        //获取命中的字符串的长度
        int lengthNeedle =needle.length();
        char[] chars = haystack.toCharArray();
        for(int i=0;i<chars.length-lengthNeedle+1;i++){
            //获取当前位置的和之后命中长度-1的那一段字符
            String substring = haystack.substring(i, i+lengthNeedle);
            if(needle.equals(substring)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = strStr("aaaaa", "bba");
        System.out.println(i);
    }
}
