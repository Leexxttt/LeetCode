package String;

import java.util.HashMap;
import java.util.Map;

/**
 *
 Write a function to find the longest common prefix string amongst an array of strings.

 If there is no common prefix, return an empty string "".

 Example 1:

 Input: ["flower","flow","flight"]
 Output: "fl"
 Example 2:

 Input: ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.
 Note:

 All given inputs are in lowercase letters a-z
 *
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        //获取最小的长度 首相相同前缀的长度不可能大于最小的长度
        int minLength = 0;
        for(int i=0;i<strs.length;i++){
            if(i==0){
                minLength=strs[i].length();
                continue;
            }
            if(strs[i].length()<minLength){
                minLength=strs[i].length();
            }
        }
        // a b c d  a和b的公共前缀
        for(int i=0;i<minLength;i++){//这层循环是最多的common prefix
            for(int j=0;j<strs.length-1;j++){
                //获取这个当前单词和下一个单词相同字母
                String str1 = strs[j];
                String str2 = strs[j+1];
                if(str1.charAt(i)!=str2.charAt(i)){
                    //截取到这一步他们相同的长度
                    return str1.substring(0,i);
                }
            }

        }

        return strs[0].substring(0,minLength);
    }

}
