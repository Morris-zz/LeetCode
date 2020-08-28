//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 705 👎 0

  
package leetcode.editor.cn;

import java.util.ArrayList;

public class MoveZeroes{
    public static void main(String[] args) {
         Solution solution = new MoveZeroes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        // 输入: [0,1,0,3,12] 1,0,0,0,33,12
        //输出: [1,3,12,0,0]
        int count = 0;
        ArrayList<Integer> integers = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                count++;
            }else {
                integers.add(nums[i]);
            }

        }
        for (int i = 0; i < count; i++) {
            integers.add(0);
        }
        for (int i = 0; i < integers.size(); i++) {
            nums[i] = integers.get(i);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }