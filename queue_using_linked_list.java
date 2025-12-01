class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class queue{
    private Node front;
    private Node rear;
    queue()
    {
        front=rear=null;
    }
    //to add a node at rear side of the queue
    public void enqueue(int data)
    {
        Node newnode=new Node(data);
        if(rear==null){
            front=rear=newnode;
            return;
        }
        else{
        rear.next=newnode;
        rear=newnode;
        }
    }
    //to delete a node from front side of the queue
    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("queue is empty.");
            return;
        }
        else{
            int value=front.data;
            System.out.println(value);
            front=front.next;
            if(front==null)
            {
                rear=null;
            }
        }
    }
//to find front value of a queue
    public void peak1()
    {
        if(front==null)
        {
            System.out.println("queue is empty.");
            return;
        }
        System.out.println(front.data);

    }
    public void peak2()
    {
        if(rear==null)
        {
            System.out.println("queue is empty");
            return;
        }
        System.out.println(rear.data);
    }
    //to display the nodes in queue
    public void display()
    {
        Node temp=front;
        if(temp==null)
        {
            System.out.println("queue is empty.");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class queue_using_linked_list {
    public static void main(String args[])
    {
        queue queue=new queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.peak1();
        queue.peak2();
        queue.enqueue(100);
        queue.display();
    }
}

