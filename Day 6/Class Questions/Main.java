import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Node head=null;
        Node temp=null;
        for(int i=0;i<n;i++){
            int data=in.nextInt();
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                temp=head;
            }
            else{
                temp.next=newNode;
                temp=newNode;
            }
        }
        temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("-> ");
            }
            temp=temp.next;
        }
    }
}