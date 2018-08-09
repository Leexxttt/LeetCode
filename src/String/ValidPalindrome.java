package String;

import java.util.ArrayList;

/**
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 *
 * amanap lana c anal panama
 *
 * 判断字符串是不是回文 忽略大小写 标点符号 只考虑字母数字
 *
 * aaaaa
 *
 * aaaa
 *  1 2 3 4 5
 * /
                                                                                                                                                     */

public class ValidPalindrome {
    public static void main(String[] args) {
        String str ="Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^(0-9A-Za-z)]","").replaceAll("[\\(\\)]","");
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        ArrayList<Character> topList =new ArrayList<>();
        ArrayList<Character> endList=new ArrayList<>();
        boolean flag=true;
       for(int i=0;i<chars.length;i++){
           if(i<(chars.length/2)){
               topList.add(chars[i]);
           }else{
               //如果是奇数的个数
               if(chars.length%2!=0&&flag==true){
                   flag=false;
                   continue;
               }
               endList.add(chars[i]);
           }
       }
        String topStr=new StringBuilder(topList.toString().replaceAll("[^(0-9A-Za-z)]","")).toString() ;
        String endString = new StringBuilder(endList.toString().replaceAll("[^(0-9A-Za-z)]","")).reverse().toString();
        if(topStr.equals(endString)){
            return true;
        }
        return false;
    }
}


