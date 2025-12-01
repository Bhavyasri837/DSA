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
public class insertion_at_end_in_single_linked_list{
    public static void main(String args[])
    {
        Node node1=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        Node newnode=new Node(50);
        Node head=node1;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    
}
