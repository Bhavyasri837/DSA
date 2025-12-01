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
public class insertion_at_position_in_single_list {
    static Node head;
    public static void insertAtPosition(int data,int position)
    {
        Node newnode=new Node(data);
        if(position==1)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        Node current=head;
        for(int i=1;i<position-1 && current!=null;i++)
        {
            current=current.next;
        }
        if(current==null)
        {
            System.out.println("position out of bounds");
            return;
        }
        newnode.next=current.next;
        current.next=newnode;
    }
    public static void printlist(Node head)
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
    node1.next=node2;
    node2.next=node3;
    node3.next=null;
    head=node1;
    printlist(head);
    insertAtPosition(123, 2);
    printlist(head);
    }
    
}
