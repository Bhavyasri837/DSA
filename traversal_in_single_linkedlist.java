class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class traversal_in_single_linkedlist{
    public static void traversal(Node head)
    {
        Node temp=head;
        while(temp!=null){
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

    node1.next=node2;
    node2.next=node3;
    node3.next=node4;

    Node head=node1;
System.out.println("linked list traversal:");
traversal(head);
    }
}
