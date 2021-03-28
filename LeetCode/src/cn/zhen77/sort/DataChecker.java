package cn.zhen77.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author : zhen77
 * @date: 2021/3/28 - 03 - 28 - 17:50
 * @Description: cn.zhen77.sort
 * @version: 1.0
 */
public class DataChecker {
    public static int[] generateRandomArray(int num){
        Random random = new Random();
        int[] arr = new int[num];
        for (int i =0;i<num;i++){
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }
    public static void checker(){
        int[] arr = generateRandomArray(1000);
        /*int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        QuickSort.sort(arr,0,arr.length-1);*/
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        Arrays.sort(arr2);
        QuickSort.sort(arr,0,arr.length-1);
//        MergeSort.sort(arr,0,arr.length-1);


        boolean result = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr2[i]) result = false;
        }
        if (result==true) {System.out.println("成功");}
        else {System.out.println("失败");}


    }

}
