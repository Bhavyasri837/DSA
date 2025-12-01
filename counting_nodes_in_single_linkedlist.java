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
public class counting_nodes_in_single_linkedlist {
    public static void counting(Node head){
    int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println(+count);
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
    //display list
    Node temp=head;
    while(temp != null){
        System.out.print(temp.data +"->");
        temp=temp.next;

    }
    System.out.println("null");
    counting(head);
}
}
