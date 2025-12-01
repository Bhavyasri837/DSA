class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class circle{
    private Node head;
    //inserion at starting 
    public void insertfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        newnode.next=head;
        temp.next=newnode;
        head=newnode;
    }
    //insertion at given position
    public void midinsertion(int data,int position)
    {
        Node newnode=new Node(data);
        if(position==1)
        {
            insertfirst(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<position-1;i++)
        {
            temp=temp.next;
            if(temp==head)
            {
                return;
            }
        }
            newnode.next=temp.next;
            temp.next=newnode;
    }
    //inserting at end of list
    public void endinsertion(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }
    //delete first
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        if(head.next==head)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
    }
    //delete last
    public void deletelast()
    {
        if(head==null)
        {
           System.out.println("empty"); 
           return;
        }
        if(head.next==head)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=head)
        {
            temp=temp.next;
        }
        temp.next=head;

    }
    //delete at particular position
    public void deletemiddle(int pos)
    {
        if(head==null||pos<=0)
        {
           System.out.println("empty"); 
           return;
        }
        if(head.next==head)
        {
            head=null;
            return;
        }
        if(pos==1)
        {
            deletefirst();
            return;
        }
        Node temp=head;
        int count=1;
        while(count<pos-1 && temp.next!=head)
        {
            temp=temp.next;
            count++;
        }
        if(temp.next==head)
        {
            System.out.println("out of bound");
            return;
        }
        temp.next=temp.next.next;
    }
    //method to display data
    public void display()
    {
        if(head==null)
        {
            System.out.println("no data");
            return;
        }
        Node temp=head;
        do
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
    }
}
public class circular_single_linked_list {
    public static void main(String args[])
    {
        circle ob=new circle();
        ob.endinsertion(12);
        ob.endinsertion(20);
        ob.endinsertion(40);
        ob.endinsertion(100);
        ob.midinsertion(200, 3);
        ob.insertfirst(130);
        ob.display();
        ob.deletefirst();
        ob.display();
        ob.deletelast();
        ob.display();
        ob.deletemiddle(3);
        ob.display();
    }
    
}
