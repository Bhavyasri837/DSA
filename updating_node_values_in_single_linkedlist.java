class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class updating_node_values_in_single_linkedlist {
    public static boolean updating(Node head,int oldvalue,int newvalue)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==oldvalue)
            {
                temp.data=newvalue;
                return true;
            }
            temp=temp.next;
        }
        return false;
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

    while(head != null){
        System.out.print(head.data +"->");
        head=head.next;
    }
    System.out.println("null");
    int oldvalue=30;
    int newvalue=300;

    if(updating(head,oldvalue,newvalue))
    {
        System.out.println(oldvalue+"updated to"+newvalue);
    }
    else{
        System.out.println(oldvalue+"not found in the list");
    }    
    System.out.println("updated linked list:");
    temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
}
