package String;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * KMP算法？？
 */
public class strStr {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        char[] chars = haystack.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (needle.charAt(0) == chars[i] && (haystack.length() - i) >= needle.length()) {
                String sub = haystack.substring(i, i + needle.length());
                if (sub.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = strStr.strStr("aaa", "aaaa");
        System.out.println(i);


    }
}
