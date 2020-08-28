//给定一个二叉树，返回所有从根节点到叶子节点的路径。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3 
// Related Topics 树 深度优先搜索 
// 👍 312 👎 0

  
package leetcode.editor.cn;

import com.zengame.adtfpf.web.controller.ad.SspTemplateConfigController;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths{
    public static void main(String[] args) {
         Solution solution = new BinaryTreePaths().new Solution();
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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> strings = addNodeToList(root);
        return strings;
    }
    public List<String> addNodeToList(TreeNode node){
        if (node == null){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        List<String> stringsLeft = addNodeToList(node.left);
        for (String s:stringsLeft) {
            StringBuffer left = new StringBuffer(String.valueOf(node.val));
            left = left.append("->").append(s);
            list.add(left.toString());
        }

        List<String> stringsRight = addNodeToList(node.right);
        for (String s:stringsRight) {
            StringBuffer right = new StringBuffer(String.valueOf(node.val));
            right = right.append("->").append(s);
            list.add(right.toString());
        }


        if (stringsRight.size() == 0 && stringsLeft.size() == 0){
            list.add(String.valueOf(node.val));
        }
        return list;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }