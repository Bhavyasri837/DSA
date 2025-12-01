class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class reversing_a_single_linked_list {
    public static Node reverse(Node head)
    {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void main(String args[])
    {
    Node node1=new Node(10);
    Node node2=new Node(20);
    Node node3=new Node(30);
    Node node4=new Node(40);

    node1.next=node2;
    node2.next=node3;
    node3.next=node4;

    Node head=node1;

    System.out.println("original linked list:");
    Node temp=head;
    while(temp!= null){
        System.out.print(temp.data +"->");
        temp=temp.next;

    }
    System.out.println("null");

    head=reverse(head);

    System.out.println("reversed linked list:");
    temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
    }
    
}
