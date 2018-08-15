package Array;

/**
 * 最大连续子数组
 * 给定一个数组A[0,...,n-1],求A的连续子数组，是的该子数组的和最大
 * 例：
 * 数组 1，-2,3,10，-4,7,2，-5
 * 最大子数组：3,10，-4,7,2
 */
public class MaxSubarray {

    public int[] getMaxSubArray(int[]array){
        int maxValue=0;
        /**
         * 0+1+2+3+4+5+6+7 = Max
         *   1+2+3+4+5+6+7 = Max
         *     2+3+4+5+6+7 = Max
         *       3+4+5+6+7 = Max
         */
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return null;
    }
}
