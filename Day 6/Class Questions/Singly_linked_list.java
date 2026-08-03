import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data =data;
    }
}

public class Singly_linked_list {
    public static Node head = null;
    static void begin_insertion(int val)
    {
        Node newnode = new Node(val);
        // insert
        if(head==null)
        {
            head = newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }
    static void display()
    {
        Node temp = head;
        if(temp==null)
            System.out.println("List is empty");
        else {
            while(temp!=null)
            {
                System.out.print(temp.data+"-> ");
                temp = temp.next;
            }
        }

    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int ele;
        while(true)
        {
            ele = input.nextInt();
            if(ele==-1)
                break;
            begin_insertion(ele);
        }

        display();
    }
}