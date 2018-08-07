package Sort;

/**
 * @AUTHOR: lxt
 * @DATE: 2018/8/7 15:41
 * @Description:
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{2,5,6};
         merge(arr1,3, arr2,3);
    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] arr3 = new int[arr1.length];
        /**
         * a[1] :: b[1]  a小
         * a[2] :: b[1]  b小
         * a[2] :: b[2]  a小
         * a[3] :: b[2]
         */
        while (i<m&&j<n){
            if(arr1[i]==0||arr2[j]==0){
                break;
            }
            if(arr1[i]<=arr2[j]){
                arr3[index++] = arr1[i++];
            }else{
                arr3[index++] = arr2[j++];
            }
        }
        // 上面的循环只能 保证一个数组完全放进新的数组中
        while (i<m){
            arr3[index++]=arr1[i++];
        }
        while (j<n){
            arr3[index++]=arr2[j++];
        }
        for(int x=0;x<arr3.length;x++){
            arr1[x]=arr3[x];
        }
    }
}
