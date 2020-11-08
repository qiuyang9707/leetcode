package Array;

/**
 * @author leo
 * @description: 167. 两数之和2 -输入有序数组
 * @create 2020-11-08 14:16
 */
public class array_167 {

    public int[] twoSum(int[] numbers, int target) {
        /**
         * 此算法的时间复杂度比较高
         */
        int start = 0;
        int[] results = new int[2];

        for (start = 0; start < numbers.length - 1; start++) {
            for (int i = start + 1; i < numbers.length; i++) {
                if (numbers[i] == target - numbers[start]) {
                    results[0] = start + 1;
                    results[1] = i + 1;
                    return results;
                }
            }
        }
        return results;
    }

    public int[] twoSum1(int[] numbers, int target) {
        /**
         * 二分查找 相较于第一种方法 在时间复杂度上减少了很多
         * 低指针  和 高指针
         */
        for (int i=0; i<numbers.length; ++i){
            int low = i+1, high = numbers.length -1;
            while (low <= high){
                int mid = (high - low)/2 + low;
                if (numbers[mid] == target - numbers[i]){
                    return new int[]{i+1, mid + 1};
                }else if (numbers[mid] > target - numbers[i]){
                    high = mid -1;
                }else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
