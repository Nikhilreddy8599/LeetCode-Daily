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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp= head;
        if(head==null){
            return null;
        }
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int n=0;
        if(count%2==0){
            n=(count/2);
        }
        else{
            n=count/2;
        }
        int i=0;
        while(i<n&&temp!=null){
            temp=temp.next;
            i++;
        }
        
        return temp;
    }
}