package cn.zhen77;

import java.util.Scanner;

/**
 * @author : zhen77
 * @date: 2021/3/31 - 03 - 31 - 16:28
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a+b+c);
        }*/
        String[] array = null;
        while (sc.hasNextLine()){
             array = sc.next().split(",");
            for (String str:array){
                System.out.println(str+"    ");
            }

        }


    }
}
