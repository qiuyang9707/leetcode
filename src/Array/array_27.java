package Array;

/**
 * @author leo
 * @description: 27. 移除元素
 * 解题思路： 利用双指针， 将非此数放到第一项， 依次类推。
 * @create 2020-10-31 16:51
 */
public class array_27 {

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


}
