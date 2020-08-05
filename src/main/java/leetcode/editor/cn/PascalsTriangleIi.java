//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 3
//输出: [1,3,3,1]
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？ 
// Related Topics 数组


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIi {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangleIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            if (rowIndex == 0){
                return integers;
            }
            ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

            arrayLists.add(integers);
            for (int i = 1; i < rowIndex + 1; i++) {
                ArrayList<Integer> list = arrayLists.get(i - 1);
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(1);
                for (int j = 0; j < i -1; j++) {
                    arrayList.add(list.get(j) + list.get(j+1));
                }
                arrayList.add(1);
                arrayLists.add(arrayList);
            }
            return arrayLists.get(rowIndex);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}















