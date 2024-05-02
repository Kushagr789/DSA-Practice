/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null)
        {
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }
        Node itr=head;
        while(itr!=null)
        {
            if(itr.random!=null)
            {
                itr.next.random=itr.random.next;
            }
            itr=itr.next.next;
        }
        Node dummy=new Node(0);
        Node res=head;
        temp=dummy;
        Node fast;
        while(res!=null)
        {
            fast=res.next.next;
            temp.next=res.next;
            res.next=fast;
            temp=temp.next;
            res=fast;
        }
        return dummy.next;
    }
}