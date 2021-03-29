package cn.leedcode;

import java.util.HashMap;

/**
 * @author : zhen77
 * @date: 2021/3/29 - 03 - 29 - 10:00
 * @Description: cn.leedcode
 * @version: 1.0
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i =0;i<nums.length;i++)
            if(map.containsKey(nums[i])) {
                result[1] = i;
                result[0] = map.get(nums[i]);
                break;

            }else{
                map.put(target - nums[i], i);

            }

        return result;
    }
    /*执行结果：
    通过
    显示详情
    执行用时：
    0 ms
    , 在所有 Java 提交中击败了
    100.00%
    的用户
    内存消耗：
    38.6 MB
    , 在所有 Java 提交中击败了
    53.02%
    的用户*/
}




