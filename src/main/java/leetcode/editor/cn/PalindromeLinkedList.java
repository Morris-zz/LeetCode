//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针 
// 👍 606 👎 0

  
package leetcode.editor.cn;

import java.util.ArrayList;

public class PalindromeLinkedList{
    public static void main(String[] args) {
         Solution solution = new PalindromeLinkedList().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0,j = list.size()-1; i < list.size() ; i++,j--) {
            if (!list.get(i).equals(list.get(j))){
                return false;
            }

        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  