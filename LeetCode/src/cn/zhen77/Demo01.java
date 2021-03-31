package cn.zhen77;

import sun.applet.Main;

/**
 * @author : zhen77
 * @date: 2021/3/31 - 03 - 31 - 19:49
 * @Description: cn.zhen77
 * @version: 1.0
 * /**
 *      * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *      * 返回a+b的和
 *      * @param a int整型
 *      * @param b int整型
 *      * @return int整型
 *      */

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {9,9,8,7,8,5,6,45,1,0,5,1};
        int i = maxProfit(arr);
        System.out.println(i);
    }
    public static  int maxProfit (int[] prices) {
        if(prices==null)return 0;
        int min = 0;
        int max = prices.length-1;
        for(int i=0;i<prices.length-1;i++){
            min = prices[i]<prices[min]?i:min;
        }
        for(int i=1;i<prices.length;i++){
            max = prices[i]>prices[max]?i:max;
        }

        return prices[max]-prices[min];
    }
}
