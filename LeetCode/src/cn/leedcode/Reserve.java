package cn.leedcode;

/**
 * @author : zhen77
 * @date: 2021/4/2 - 04 - 02 - 22:33
 * @Description: cn.leedcode
 * @version: 1.0
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 *
 * 如果 temp = \text{rev} \cdot 10 + \text{pop}temp=rev⋅10+pop 导致溢出，那么一定有 \text{rev} \geq \frac{INTMAX}{10}rev≥
 * 10
 * INTMAX
 * ​
 *  。
 * 如果 text{rev} > frac{INTMAX}{10}rev>10INTMAX
 * ​
 * 那么 temp = text{rev} cdot 10 + text{pop}temp=rev⋅10+pop 一定会溢出。
 * 如果 \text{rev} == \frac{INTMAX}{10}rev==10INTMAX
 * ​
 *  ，那么只要 \text{pop} > 7pop>7，temp = \text{rev} \cdot 10 + \text{pop}temp=rev⋅10+pop 就会溢出
 *

 */
public class Reserve {
    public static void main(String[] args) {
        System.out.println(Math.pow(10,2));
//        System.out.println(Integer.MAX_VALUE);2147483647
        int reverse = reverse(2147483645);
//        int reverse = reverse(2122);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            //取末尾数字
            int temp = x%10;
            if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&temp>7)){
                return 0;
            }
            if(result<Integer.MIN_VALUE/10||(result==-214748364 && temp<-8)){
                return 0;
            }
            result = result*10+temp;
            x/=10;
        }
        return result;
    }
}
