/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = head;
        ListNode cur = head.next;
        int[] answer = {-1, -1};
        int prePosition = -1, curPosition = -1, firstPosition = -1, position = 0;
        while(cur.next != null){
            if((cur.val < pre.val && cur.val < cur.next.val) || (cur.val > pre.val && cur.val > cur.next.val)){
                prePosition = curPosition;
                curPosition = position;
                if(firstPosition == -1){
                    firstPosition = position;
                }
                if(prePosition != -1){
                    if(answer[0] == -1) answer[0] = curPosition - prePosition;
                    else answer[0] = Math.min(answer[0], curPosition - prePosition);
                    answer[1] = position - firstPosition;
                }
            }
            position++;
            pre = cur;
            cur = cur.next;
        }
        return answer;
    }
}
