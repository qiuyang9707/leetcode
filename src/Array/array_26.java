package Array;

import java.util.Arrays;

/**
 * @author leo
 * @description: 26. 删除排序数组中的重复项
 * 解题心得：
 *      双指针， 另外不要局限于“等号”作为判断条件
 * @create 2020-10-30 21:17
 */
public class array_26 {

    public  static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j=1; j < nums.length; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[]  nums = {1,1,2,3,4};
        int i = removeDuplicates(nums);
        for (int j = 0 ; j < i; j++){
            System.out.println(nums[j]);
        }

    }
}
