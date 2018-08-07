package String;

/**
 *The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 *
 * in n=1 out 11  -->1个1
 * in n=2 out 21  --->两个1
 * in n=3 out 1211 ---->1个2 1个1
 * in n=4 out 111221 ----> 1个1 1个2 2个1
 * In n=5 out 312211 ---> 13112221
 */
public class CountAndSay {
    public static void main(String[] args) {
        String s = countAndSay("111221");
        System.out.println(s);
    }
    public static String countAndSay(String str) {
        String result ="";
        char[] chars = str.toCharArray();
        int count =1;
        //1 1 1 2 2 1
        for(int i=1;i<chars.length;i++){
            //当前元素和前一个元素相同 count++ 不相同 记录下来
            int index = i-1;
            if(chars[i]==chars[index]){
                count=count+1;
                //最后了
                if(i==chars.length-1){
                    result+=count+chars[i];
                }else{
                    continue;
                }
            }else{
                int index2 = i-1;
                result+=count+""+chars[index2];
                count=1;
                //如果是最后一个
                if(i==chars.length-1) {
                    result += count + chars[i];
                }
                continue;
            }
        }
        return result;
    }
}
