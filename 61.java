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
    public ListNode rotateRight(ListNode head, int k) {
        int len=1;
        ListNode temp=head;
        ListNode temp1=head;
        if(head==null || head.next==null){
            return head;
        }

        while(temp.next!=null){
            len++;
            temp=temp.next;
        }

        int rot=k%len;
        if(rot==0)return head;


        for(int i=0;i<len-rot-1;i++){
            temp1=temp1.next;
        }
        ListNode newhead=temp1.next;
        temp.next=head;
        temp1.next=null;
        return newhead;

    }
}