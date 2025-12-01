class Node 
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class deletion_at_position_single_linkedlist {
    static Node head;
    public static void deleteAtPosition(int pos)
    {
        if(head==null||pos<=0)
        {
            System.out.println("empty list");
            return;
        }
        if(pos==1)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        int count=1;
        while(count<pos-1 && temp!=null)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null||temp.next==null)
        {
            System.out.println("out of bounds");
            return;
        }
        temp.next=temp.next.next;
    }
    public static void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        Node node1=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        Node node4=new Node(40);
        Node node5=new Node(50);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
        head=node1;
        display();
        deleteAtPosition(3);
        display();

    }
    
}
