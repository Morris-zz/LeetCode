//计算给定二叉树的所有左叶子之和。 
//
// 示例： 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24 
//
// 
// Related Topics 树 
// 👍 186 👎 0

  
package leetcode.editor.cn;



public class SumOfLeftLeaves{
    public static void main(String[] args) {
         Solution solution = new SumOfLeftLeaves().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

       return getLeftNum(root,false);
    }
    public int getLeftNum(TreeNode root, Boolean isLeft){

        if (root == null){
            return 0;
        }

        if (isLeft &&  root.left == null && root.right == null){
            return root.val;
        }


        return getLeftNum(root.left,true) +  getLeftNum(root.right,false);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }


