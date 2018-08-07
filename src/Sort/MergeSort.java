package Sort;

/**
 * @AUTHOR: lxt
 * @DATE: 2018/8/7 12:28
 * @Description:
 * 两个有序数组 合并到一起 还是一个有序数组
 *  1 4 8 9
 *  1 2 4 5
 *  1 1 2 4 4 5 8 9
 *
 *  1
 *  1 2 4 5  1
 *
 *    4
 *  1 2 4 5
 *
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,4,8,9};
        int[] arr2 = new int[]{1,2,4,5};
        int[] arr3 = sort(arr1, arr2);
    }


    public static int[] sort(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        int index = 0;
        int[] arr3 = new int[arr1.length+arr2.length];
        int len1 = arr1.length;
        int len2 = arr2.length;
        /**
         * a[1] :: b[1]  a小
         * a[2] :: b[1]  b小
         * a[2] :: b[2]  a小
         * a[3] :: b[2]
         */
        while (i<len1&&j<len2){
            if(arr1[i]<=arr2[j]){
                arr3[index++] = arr1[i++];
            }else{
                arr3[index++] = arr2[j++];
            }
        }
        // 上面的循环只能 保证一个数组完全放进新的数组中
        while (i<len1){
            arr3[index++]=arr1[i++];
        }
        while (j<len2){
            arr3[index++]=arr2[j++];
        }
        return arr3;
    }
}
