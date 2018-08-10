package interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 统计d盘文件data.txt中e的出现次数
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        int count = count("D:/data.txt");
        System.out.println(count);
    }

    public static int count(String filePath){
        try {
            int count=0;
            FileReader fr = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fr);
            String result = "";
            String str = "";
            while ((str=reader.readLine())!=null){
                result+=str;
            }
            char[] chars = result.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='e'){
                    count++;
                }
            }
            return count;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    return 0;

    }
}
