package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leo
 * @description: 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @create 2020-11-05 20:03
 */
public class array_66 {
    public int[] plusOne(int[] digits) {
        /**
         * 学习大佬的思想, 抓住核心思想， 就是“10”
         */
        for (int i = digits.length - 1; i >= 0; i--){
           digits[i]++;
           digits[i] = digits[i] % 10;
           if (digits[i] != 0)
               return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
