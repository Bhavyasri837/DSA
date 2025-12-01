class Node{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DLLmethods
{
    private Node head;
    private Node tail;
    //insertion at front
    public void inserAtFront(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    //insertion at end
    public void insertionAtEnd(int data)
    {
        Node newnode=new Node(data);
        if(tail==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    //forward traversal
    public void displayforward()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("empty no nodes to display");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //display backward/backward traversal
    public void displayBackward()
    {
        Node temp=tail;
        if(temp==null)
        {
            System.out.println("empty do nodes to display");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    //to delete last node
    public void deletelast()
    {
        if(tail==null)
        {
            System.out.println("empty cant perform delete operation");
            return;
        }
        else if(tail==head)
        {
            head=tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    //to delete first node
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("no nodes to delete");
            return;
        }
        if(head==tail)
        {
            tail=head=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
}
public class double_linked_list {
    public static void main(String args[])
    {
        DLLmethods ob=new DLLmethods();
        ob.insertionAtEnd(12);
        ob.inserAtFront(30);
        ob.inserAtFront(90);
        ob.insertionAtEnd(100);
        ob.deletelast();
        ob.deletefirst();
        ob.displayBackward();
        ob.displayforward();
    }
}
