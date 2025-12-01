class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class deletion_at_begining_in_single_linked_list {
    static Node head;
    public static void deleteAtBeginning()
    {
        if(head==null)
        {
            System.out.println("null");
            return;
        }
        head=head.next;
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
        deleteAtBeginning();
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
