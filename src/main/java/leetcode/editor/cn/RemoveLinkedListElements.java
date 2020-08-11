//删除链表中等于给定值 val 的所有节点。 
//
// 示例: 
//
// 输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
// 
// Related Topics 链表


package leetcode.editor.cn;

import java.util.List;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Solution solution = new RemoveLinkedListElements().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)


  public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return null;
            }

            //定义辅助节点
            ListNode fiNode = new ListNode(0);
            fiNode.next = head;
            ListNode currNode = head;
            ListNode qNode = fiNode;
            while (currNode != null){
                if (currNode.val == val){
                    qNode.next = currNode.next;
                    currNode = currNode.next;
                }else {
                    qNode = qNode.next;
                    currNode = currNode.next;
                }
            }
            return fiNode.next;


        }
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */



//leetcode submit region end(Prohibit modification and deletion)

}