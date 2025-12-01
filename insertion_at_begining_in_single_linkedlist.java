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
public class insertion_at_begining_in_single_linkedlist {
public static void main(String args[])
{
    Node node1=new Node(10);
    Node node2=new Node(20);
    Node node3=new Node(30);
    node1.next=node2;
    node2.next=node3;
    node3.next=null;
    Node head=node1;
    Node newnode=new Node(5);
    newnode.next=head;
    head=newnode;
    while(head!=null)
    {
        System.out.println(head.data);
        head=head.next;
    }
}
}
