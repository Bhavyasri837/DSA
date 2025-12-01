class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class searching_in_single_linkedlist {
    public static boolean search(Node head,int key)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
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

    System.out.println("linked list:");
    Node temp=head;

    while(temp!= null){
        System.out.print(temp.data +"->");
        temp=temp.next;
    }
    System.out.println("null");
    int key=30;
    if(search(head, key))
    {
        System.out.println(key+" found in the list");
    }
    else{
        System.out.println(key+" not found in the list");
    }
    }
}

