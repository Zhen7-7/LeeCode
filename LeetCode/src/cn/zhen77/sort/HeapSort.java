package cn.zhen77.sort;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.lang.annotation.Target;

/**
 * @author : zhen77
 * @date: 2021/4/1 - 04 - 01 - 22:57
 * @Description: cn.zhen77.sort
 * @version: 1.0
    当我们知道了i节点  可知其左孩子 2*i+1 右孩子为2i+2；
    父节点i/2
    什么是heapify 就是 将index依次往下坐的过程

 */
public class HeapSort {
    public static void main(String[] args) {
        DataChecker.checker();
    }
    public static void heapSort(int[] arr){
        for (int i =arr.length-1;i>=0;i--){
            heapify(arr,i,arr.length);
        }
        int heapSize = arr.length;
        while (heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }
    public static void  heapify(int[] arr ,int index,int heapSize){
        int left = index<<1|1;
        while (left<heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, index, largest);
            index = largest;
            left = index<<1|1;
        }
    }
    public static void swap(int[] arr,int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
