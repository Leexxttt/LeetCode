package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @AUTHOR: lxt
 * @DATE: 2018/8/6 10:39
 * @Description:
 *
 * 804:将英文单词转换成摩斯码
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *
 */
public class UniqueMorseCodeWords {

    static Map<Character,String> MORCECODEMAP = new HashMap<>();

    static {
        String[] morseCodeArray={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       int i=0;
        for(char c='a';c<'a'+26;c++){
           MORCECODEMAP.put(c,morseCodeArray[i]);
           i++;
       }

    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> resultSet = new HashSet<>();
        for(int i=0;i<words.length;i++){
            char[] charsArray = words[i].toCharArray();
            String tempStr="";
            for(int j=0;j<charsArray.length;j++){
                tempStr+=MORCECODEMAP.get(charsArray[j]);
            }
            resultSet.add(tempStr);
        }
        return resultSet.size();
    }


    public static void main(String[] args) {
        String[] words ={"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
