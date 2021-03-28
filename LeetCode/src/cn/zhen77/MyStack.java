package cn.zhen77;

/**
 * @author : zhen77
 * @date: 2021/3/28 - 03 - 28 - 16:59
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class MyStack {
    private int[] arr;
    private int pushi;
    private int popi;
    private int size;
    private int length;

    public MyStack(int length){
        arr = new int[length];
        pushi=0;
        popi=0;
        size=0;
        this.length = length;
    }
}
