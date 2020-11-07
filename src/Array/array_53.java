package Array;

/**
 * @author leo
 * @description: 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @create 2020-11-05 10:32
 */
public class array_53 {

    public int maxSubArray(int[] nums) {
        /**
         * 动态规划思想
         */
        int pre = 0, maxAns = nums[0];
        for (int x : nums){
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

}
