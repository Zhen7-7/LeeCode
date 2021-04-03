package cn.zhen77.sort;

import com.sun.media.sound.MidiInDeviceProvider;

import java.nio.channels.DatagramChannel;

/**
 *{
 *
 *} @author : zhen77
 * @date: 2021/4/3 - 04 - 03 - 23:23
 * @Description: cn.zhen77.sort
 * @version: 1.0
 */
public class SelectionSort {
    /*选择排序
    * 定义一个指针，每次选择一个最小值，将当前遍历的数和最小值交换
    *   为什么不能用异或运算，是因为如果该值为最小值，那么相同的值异或为0；
    * */
    public static void main(String[] args) {
        DataChecker.checker();
        /*int[] arr = {6,5,4,3,2,1};
        sortPlus(arr);
       *//* swap(arr,0,0);*//*
        for (int i:arr){
            System.out.print( i+" ");
        }*/

    }
    public  static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minPointer = i;
            for (int j=i+1;j<arr.length;j++){
                minPointer= arr[j]<arr[minPointer] ?j:minPointer;
            }
            swap(arr,i,minPointer);
        }
    }
    public static void sortPlus(int[] arr){
        for (int i =0;i<arr.length>>1;i++){
            int minPointer=i;
            int maxPointer=arr.length-i-1;

            for(int j=i;j<arr.length-i;j++){
                minPointer = arr[j]<arr[minPointer]?j: minPointer;
            }
            swap(arr,i,minPointer);
            for (int j=arr.length-i-1;j>i;j--){
                maxPointer = arr[j]>arr[maxPointer]?j: maxPointer;
            }
            swap(arr,arr.length-i-1,maxPointer);

        }

    }
    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        /*arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
*/
    }
}
