package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given two strings A and B of lowercase letters,
 * return true if and only if we can swap two letters in A so that the result equals B
 *
 *
 * Example 1:
 *
 * Input: A = "ab", B = "ba"
 * Output: true
 * Example 2:
 *
 * Input: A = "ab", B = "ab"
 * Output: false
 * Example 3:
 *
 * Input: A = "aa", B = "aa"
 * Output: true
 * Example 4:
 *
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"  abadcb  aadbcb
 * Output: true
 * Example 5:
 *
 * Input: A = "", B = "aa"
 * Output: false
 *
 *
 * Note:
 *
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist only of lowercase letters
 *
 * A 和B都是由小写字母组成的字符串 要求只转换两个字符将A==B 并且A只能且必须转换两个字符位置
 */
public class BuddyStrings {

    public static void main(String[] args) {
        String A = "ab";String B = "ba";
        boolean result = buddyStrings(A, B);
        System.out.println(result);
        String C = "ab";String D = "ab";
        boolean result2 = buddyStrings(C, D);
        System.out.println(result2);
        String E = "aa";String F = "aa";
        boolean result3 = buddyStrings(E, F);
        System.out.println(result3);

        String G = "aaaaaaabc";String H = "aaaaaaacb";
        boolean result4 = buddyStrings(G, H);
        System.out.println(result4);

        String I = "";String J = "aa";
        boolean result5 = buddyStrings(I, J);
        System.out.println(result5);


    }

    public static boolean buddyStrings(String A, String B) {
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        /**
         * 条件1：A中元素的数量一定和B中一致 如：A中有五个a B中也要有五个a A中有3个b B中也要有3个b
         * 条件2：A中元素只能有两个位置和B中元素不一致 这样才能满足一次调换
         */
        //去掉特殊情况
        if(charA.length!=charB.length){
            return false;
        }
        if(charA.length<=1){
            return false;
        }
       //检测A和B中不同位置元素的个数
        int count = 0;
        for(int i=0;i<charA.length;i++){
            if(charA[i]!=charB[i]){
                count++;
            }
        }
        if(count==0){
            //每一个位置都相同
            //如果A中没有重复的元素 return false
            Map charMap =new HashMap();
            for(int i=0;i<charA.length;i++){
                if(charMap.containsKey(charA[i])){
                    return true;
                }else{
                    charMap.put(charA[i],i);
                }
            }
            if(charMap.keySet().size()==charA.length){
                return false;
            }
        }
        if(count!=2){
            return false;
        }
        return true;
    }
}
