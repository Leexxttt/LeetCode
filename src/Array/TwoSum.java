package Array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,   (7,2,-2,-6)
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * 给出数组中两个能够加起来之和等于目标数字的下标
 *
 * ：：：：
 * 取出数和目标比较
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] targetArray = new int[]{3, 2,4 };
        System.out.println(twoSum(targetArray,6).toString());
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] returnArray = new int[2];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            //获取他们和目标值的差值
            list.add(target-nums[i]);
        }
        boolean flag=false;
       for(int i=0;i<list.size();i++){
           if(flag) break;
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==target){
                    returnArray[0]=i;
                    returnArray[1]=j;
                    flag=true;
                    break;
                }
            }
       }

        return returnArray;
    }
}
