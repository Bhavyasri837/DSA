class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

    class Stack{
    private Node top;
    public void push(int data)
    {
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;
    }
    public void pop()
    {
        if(top==null)
        {
            System.out.println("underflow");
        }
        System.out.println(top.data);
        top=top.next;
       
    }
    public void peek()
    {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }
    public void display()
    {
        Node temp=top;
        if(temp==null)
        {
            System.out.println("stack is empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null"+"\n");
    }
    
}
public class stack_using_single_linked_list {
    public static void main(String args[])
    {
         Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); 
        stack.peek();     
        stack.pop();   
        stack.display();   
    }
    
}
