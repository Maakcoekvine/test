package search;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-29 09:23:17
 */

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array=new int[]{9,10,11,12,13,14,15,16,17};
        int target=100;
        long begin=System.currentTimeMillis();
        int reslut = search(array, target);
        long end=System.currentTimeMillis();
        System.out.println(end-begin+"ms");
        System.out.println(reslut);
    }
    public static int search(int[] array,int target){
        //最小指针
        int min=0;
        //最大指针
        int max=array.length-1;
        while (min<=max){
            //中间指针
            int mid=(min+max)/2;

            if (array[mid]==target){
                return mid;
            }
            if (target>array[mid]){
                min=mid+1;
            }
            if (target<array[mid]){
                max=mid-1;
            }
        }
        return -1;
    }
}
