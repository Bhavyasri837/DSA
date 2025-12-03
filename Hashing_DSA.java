import java.util.LinkedList;
class HashCode{
    private int size=10;
    private LinkedList<Integer>[] table;
    HashCode()
    {
        table= new LinkedList[size];
        for(int i=0;i<size;i++)
        {
            table[i]=new LinkedList<>();
        }
    }
    //hash function
    public int hash(int data)
    {
        return data%size;
    }
    //function for insertion of data
    public void insertdata(int data)
    {
        int index=hash(data);
        table[index].add(data);
    }
    //display function
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(i+"->"+table[i]);
        }
    }
    //method for searching of data
    public String search(int key)
    {
        int index = hash(key);
        if (table[index].contains(key)) {
            return "Data " + key + " found at index " + index;
        } else {
            return "Data " + key + " not found";
        }

    }
    //method to delete
    public boolean deletedata(int data)
    {
        int index=hash(data);
        return table[index].remove(Integer.valueOf(data));
    } 
}
public class Hashing_DSA {
    public static void main(String args[])
    {
        HashCode ob=new HashCode();
        ob.insertdata(12);
        ob.insertdata(20);
        ob.insertdata(30);
        ob.insertdata(40);
        ob.insertdata(20);
        ob.insertdata(10);
        ob.insertdata(60);
        ob.insertdata(70);
        ob.insertdata(80);
        ob.insertdata(50);
        ob.insertdata(90);
        ob.insertdata(30);

        System.out.println("Hash Table:");
        ob.display();

        System.out.println(ob.search(12));  // prints if 30 is found or not
        System.out.println(ob.search(67));  // prints if 67 is found or not
        
        boolean deleted = ob.deletedata(90);
        System.out.println("Deleting 90: " + (deleted ? "Success" : "Not found"));

        System.out.println("Hash Table after deletion:");
        ob.display();

    }
}
