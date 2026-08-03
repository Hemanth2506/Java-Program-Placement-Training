import java.util.*;
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data=data;
        this.next=null;
    }
}
class searchString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            String str=in.nextLine();
            Node newNode=new Node(str);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        String key=in.nextLine();
        Node temp=head;
        boolean found=false;
        while(temp!=null){
            if(temp.data.equals(key)){
                found=true;
                break;
            }
            temp=temp.next;
        }
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}