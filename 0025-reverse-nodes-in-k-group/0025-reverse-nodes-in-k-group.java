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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupprev=dummy;
        while(true){
            ListNode kth= groupprev;
            for(int i=0;i<k;i++){
                if(kth==null){
                    break;
                }
                kth=kth.next;
            }
            if(kth==null){
                break;
            }
        
        ListNode groupnext = kth.next;
        ListNode prev=groupnext;
        ListNode curr = groupprev.next;
        while(curr!=groupnext){
            ListNode nex= curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        ListNode temp=groupprev.next;
        groupprev.next=kth;
        groupprev=temp;
    }
    return dummy.next;
    }
}