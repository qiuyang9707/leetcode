package Array;

/**
 * @author leo
 * @description: 35: 插入搜索位置
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 * @create 2020-11-04 21:26
 */
public class array_35 {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }

            if (target < nums[i]){
                return i;
            }
        }
        return nums.length;
    }


    public int searchInsert2(int[] nums, int target){
        /**
         * 利用二分法， 解决问题
         */
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right){
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]){
                ans = mid;
                right = mid -1 ;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }


}
