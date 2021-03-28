package cn.zhen77.sort;

import java.lang.reflect.Array;

/**
 * @author : zhen77
 * @date: 2021/3/28 - 03 - 28 - 17:35
 * @Description: cn.zhen77.sort
 * @version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        DataChecker.checker();
    }
    public static void sort(int[] arr, int leftBound,int rightBound){
        if (rightBound<=leftBound) return;
        int mid = partition(arr,leftBound,rightBound);
        sort(arr,leftBound,mid-1);
        sort(arr,mid+1,rightBound);
    }

    public static int partition(int[] arr ,int leftBound,int rightBound){
        int left= leftBound;
        int right = rightBound-1;
        int pivot = arr[rightBound];

        while (left<=right){
            while(arr[left]<=pivot && left<=right) left++;
            while(arr[right]>pivot && left<=right) right--;
            if(left<right ) swap(arr,left,right);
        }
        swap(arr,left,rightBound);
        return left;
    }

    public static void swap(int[] arr,int a ,int b){
        /*arr[a]=arr[a] ^ arr[b];
        arr[b]=arr[a] ^ arr[b];
        arr[a]=arr[a] ^ arr[b];*/
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
