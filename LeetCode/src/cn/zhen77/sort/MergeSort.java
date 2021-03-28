package cn.zhen77.sort;

/**
 * @author : zhen77
 * @date: 2021/3/28 - 03 - 28 - 18:28
 * @Description: cn.zhen77.sort
 * @version: 1.0
 */
public class MergeSort {
    public static void main(String[] args) {
        DataChecker.checker();

    }
    public static void sort(int[] arr, int left,int right){
        if (right==left) return;
        int mid = left+((right-left)>>1);
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid+1,right);
    }

    public static void merge(int arr[] ,int leftPointer,int rightPointer,int rightbound){
        int mid = rightPointer-1;
        int [] temp = new int[rightbound-leftPointer+1];
        int i = leftPointer;
        int j = rightPointer;
        int k = 0;
        while(i<=mid&&j<=rightbound){
            temp[k++] = arr[i]<=arr[j]? arr[i++] :arr[j++];
        }
        while(i<=mid) temp[k++] = arr[i++];
        while (j<=rightbound) temp[k++] = arr[j++];

        for(int n=0;n<temp.length;n++){
            arr[leftPointer+n] = temp[n];
        }
    }
}
