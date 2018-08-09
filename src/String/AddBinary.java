package String;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * 8  4  2  1
 *       1  1  ==>3
 *          1  ==>1
 *    1  0  0  ==>4
 *
 *          1
 *    1  1  1
 *
 *   1  0   0  0
 *
 * 1  0  1  0  ==>10
 * 1  0  1  1  ==>11
 1 0  1  0  1
 *
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }


    public static String addBinary(String a,String b){
        StringBuilder result = new StringBuilder();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        //获取每一位上面的值相加
        int i=aChars.length-1;
        int j=bChars.length-1;
        boolean addCount=false;
        while(i>=0&&j>=0){
            //从后往前加
            int sum = Integer.valueOf(String.valueOf(aChars[i]))+ Integer.valueOf(String.valueOf(bChars[j]));
           //这个和只有三种情况 0 1 2
            if(sum==2){
               //判断有没有进位
                if(addCount){
                    result.append("1");
                }else{
                    result.append("0");
                }
                addCount=true;
            }else{
                //判断有没有进位
                if(addCount){
                    sum=sum+1;
                    if(sum==2){
                        result.append("0");
                        addCount=true;
                    }else{
                        result.append(sum);
                        addCount=false;
                    }
                }else{
                    result.append(sum);
                    addCount=false;
                }
            }
            i--;
            j--;
        }
        while(i>=0){
            int sum = Integer.valueOf(String.valueOf(aChars[i]));
            if(addCount){
                sum=sum+1;
                //如果是进位
                if(sum==2){
                    result.append("0");
                    addCount=true;
                }else{
                    result.append(sum);
                    addCount=false;
                }
            }else{
                result.append(sum);
                addCount=false;
            }
            i--;
        }
        while(j>=0){
            int sum = Integer.valueOf(String.valueOf(bChars[j]));
            if(addCount){
                sum=sum+1;
                //如果是进位
                if(sum==2){
                    result.append("0");
                    addCount=true;
                }else{
                    result.append(sum);
                    addCount=false;
                }
            }else{
                result.append(sum);
                addCount=false;
            }
            j--;
        }
        if(addCount){
                result.append("1");
        }
        return result.reverse().toString();
    }
}
