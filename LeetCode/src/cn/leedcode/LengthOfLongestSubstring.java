package cn.leedcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : zhen77
 * @date: 2021/3/30 - 03 - 30 - 23:01
 * @Description: cn.leedcode
 * @version: 1.0
 */
//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        int abcdefadsfc = lengthOfLongestSubstring1("abcdefadsfc");
        System.out.println(abcdefadsfc);

    }
    public static int  lengthOfLongestSubstring1(String str){
        Set<Character> set = new HashSet<>();
        int pointer = -1;
        int result =0;
        for(int i =0;i<str.length();i++){
            if(i!=0) {
                set.remove(str.charAt(i-1));
            }
            while (pointer+1<str.length() && !set.contains(str.charAt(pointer+1))){
                set.add(str.charAt(pointer+1));
                pointer++;
            }
            result = Math.max(result,pointer-i+1);

        }
        return result;
    }
    public static int  lengthOfLongestSubstring2(String str){
        Map<Character,Integer> map = new HashMap<>();
        int left = 0 , right = 0 ,result = 0;
        for(;right<str.length();right++){
            if(map.containsKey(str.charAt(right))){
                left = Math.max(map.get(str.charAt(right)),left);
            }
            result = Math.max(result,right-left+1);
            map.put(str.charAt(right),right+1);

        }
        return result;
    }
}
//执行用时：
//8 ms
//, 在所有 Java 提交中击败了
//55.00%
//的用户
//内存消耗：
//38.3 MB
//, 在所有 Java 提交中击败了
//92.97%
//的用户
