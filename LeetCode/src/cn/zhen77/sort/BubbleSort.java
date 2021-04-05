package cn.zhen77.sort;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @author : zhen77
 * @date: 2021/4/5 - 04 - 05 - 22:48
 * @Description: cn.zhen77.sort
 * @version: 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        DataChecker.checker();
    }
    public static void sort(int[] arr){
        for(int j = 0; j<arr.length;j++){
            for (int i=0;i<arr.length-j-1;i++){
                if (arr[i]>arr[i+1]) swap(arr,i,i+1);
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
