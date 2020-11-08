package Array;

import javax.swing.*;

/**
 * @author leo
 * @description: 122. 买卖股票的最佳时机 II
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * @create 2020-11-07 17:03
 */
public class array_122 {

    public int maxProfit(int[] prices) {
        /**
         * 使用动态规划的算法：
         * 步骤：分析问题的关键
         * 找到状态转移方程
         * 再确定初始状态
         */
            int n = prices.length;
            int[][] dp = new int[n][2];
            dp[0][0] = 0;
            dp[0][1] = -prices[0];
            for (int i = 1; i < n; i++){
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i-1][0]-prices[i], dp[i-1][1]);
        }
            return dp[n-1][0];
    }


    public int  maxProfit1(int[] prices){
        /**
         * 贪心算法 求解
         */
        int ans =0;
        int n = prices.length;
        for (int i =1; i< n; i++){
            ans += Math.max(0, prices[i] - prices[i-1]);
        }
        return ans;
    }
}
