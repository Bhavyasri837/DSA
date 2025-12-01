class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class deletion_at_end_in_single_linkedlist{
    static Node head;
    public static void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.println("empty list");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node current=head;
        while(current.next.next!=null)
        {
            current=current.next;
        }
        current.next=null;
    }
    public static void main(String args[])
    {
        Node node1=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        
        head=node1;
        Node temp=head;
        //display method before deletion
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        deleteAtEnd();
        temp=head;
        //display method before deletion
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
}
