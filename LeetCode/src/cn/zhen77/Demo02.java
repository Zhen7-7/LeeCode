package cn.zhen77;

/**
 * @author : zhen77
 * @date: 2021/3/31 - 03 - 31 - 20:06
 * @Description: cn.zhen77
 * @version: 1.0
["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"],"FB"
[true,false,true,true,false]
a:97  z:112 A 65  Z90
 */
public class Demo02 {
    public static void main(String[] args) {
        char a = 'z';
        System.out.println((int)a);


    }

    public boolean[] camelMatch(String[] queries, String pattern) {
        boolean[] result = null;
        boolean temp = false;
        char[] c1 = null;
        char[] c2 = null;
        int m =0;
        int index=0;
        for (int i = 0; i < pattern.length(); i++){
            if( pattern.charAt(i)>64&&pattern.charAt(i)<91) c2[m++]=pattern.charAt(i);
        }
        for(String str : queries) {

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 64 && str.charAt(i) < 91) c1[m++] = str.charAt(i);
            }
            for(int i=0;i<c1.length;i++){
                if(c1.length!=c2.length)
                {temp = false;break;    }
                temp = c1[i]==c2[i]? true :false;
            }
            result[index++] = temp;
        }
        return result;
    }
}
