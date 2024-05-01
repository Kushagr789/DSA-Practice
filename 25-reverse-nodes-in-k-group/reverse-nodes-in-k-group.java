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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static ListNode kNode(ListNode head,int k){
        k=k-1;
        ListNode temp=head;
        while(temp!=null&&k>0)
        {
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        ListNode prevN=null;
        while(curr!=null){
            ListNode kth=kNode(curr,k);
            if(kth==null)
            {
                if(prevN!=null)
                prevN.next=curr;

                break;
            }
            ListNode nextN=kth.next;
            kth.next=null;
            reverse(curr);
            if(curr==head)
            head=kth;
            else{
                prevN.next=kth;
            }
            prevN=curr;
            curr=nextN;
        }
        return head;
    }
}