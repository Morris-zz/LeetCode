//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [3,2,3]
//输出: 3 
//
// 示例 2: 
//
// 输入: [2,2,1,1,1,2,2]
//输出: 2
// 
// Related Topics 位运算 数组 分治算法


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Comparator;

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            list.sort(Comparator.comparingInt(Integer::intValue));
            int i = list.size() / 2;
            return list.get(i);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}