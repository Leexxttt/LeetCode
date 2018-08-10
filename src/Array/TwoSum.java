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
        int[] targetArray = new int[]{2, 7, 11, 15};
        twoSum(targetArray,9);
    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            //获取他们和目标值的差值
            list.add(target-nums[i]);
        }
       for(int i=0;i<list.size();i++){
            if((list.get(i)+list.get(i+1))==9){

            }
       }

        return null;
    }
}
