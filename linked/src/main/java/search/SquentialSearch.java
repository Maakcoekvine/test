package search;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-29 09:17:49
 */

/***
 * 顺序查找，也叫遍历查找
 */
public class SquentialSearch {
    public static void main(String[] args) {
        int[]array=new int[]{14,3,35,6,27,9,10,65,7,1,3,44,33,222,5,57,8,975,5,44,45};
        int target=14;
        long begin=System.currentTimeMillis();
        int search = search(array, target);
        long end=System.currentTimeMillis();
        System.out.println(end-begin+"ms");
        System.out.println(search);
    }
    public static int search(int[] array,int target){

        for (int i=0;i<array.length;i++){
            if (array[i]==target){

                return i;
            }
        }
        return -1;
    }
}
