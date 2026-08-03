//Leetcode
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

//GeeksForGeeks
class Solution {
    Node deleteNode(Node head,int x) {
        if(x==1){
            return head.next;
        }
        Node temp=head;
        for(int i=1;i<x-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}