package String;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World "
 * Output: 5
 *
 * 获取最后一个单词的长度
 */
public class LengthofLastWord {
    public static void main(String[] args) {
        int hello_world_ = lastLength(" ");
        System.out.println(hello_world_);
    }


    public static int lastLength(String words){

        String[] wordsArray = words.split(" ");
        if(wordsArray.length<1){
            return 0;
        }
        return wordsArray[wordsArray.length-1].length();
    }
}
