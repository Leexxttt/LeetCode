package String;

/**
 * 统计 failsdfaisefaildfailfailfaie1cfiaeow12fail1 统计fail出现的次数
 *
 */
public class CountWordsNum {
    public static void main(String[] args) {
        System.out.println(countWordsNum("failsdfaisefaildfailfailfaie1cfiaeow12failfailfa"));
        System.out.println(countWordsNum("fail"));
    }

    public static int countWordsNum(String str){
        char[] chars = str.toCharArray();
        /**
         * 用第一个和他后面的三个的组合判断
         */
        int count =0;
        if(chars.length<4){
            return 0;
        }
        for(int i=3;i<chars.length;i++){
            String result = new Character(chars[i-3]).toString() + new Character(chars[i-2]).toString() + new Character(chars[i-1]).toString() + new Character(chars[i]).toString();
            if("fail".equals(result)){
                count++;
            }
        }
        return count;
    }
}
