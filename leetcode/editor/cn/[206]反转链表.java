//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表 
// 👍 1331 👎 0


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
    public ListNode reverseList(ListNode head) {
        return reverseInt(head,null);
    }

    private ListNode reverseInt(ListNode head, ListNode newHead) {
        if(head == null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return reverseInt(next,head);
    }
}
//leetcode submit region end(Prohibit modification and deletion)