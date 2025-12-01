//importing useful packages
import java.util.*;
//create a class 
class Graphs_in_DSA
{
    private Map<String,List<String>> adjacencyList;
    
    public Graphs_in_DSA()
    {
        adjacencyList=new HashMap<>();
    }
//method to add nodes
    public void addNode(String v)
    {
        adjacencyList.putIfAbsent(v,new ArrayList<>());
        for(String node:adjacencyList.keySet())
        {
            if(node!=v)
            {
                addEdge(node,v);
            }
        }
    }
    //method to add edges to connect all nodes
    public void addEdge(String u,String v)
    {
    
        if(!adjacencyList.containsKey(u)) addNode(u);
        if(!adjacencyList.containsKey(v)) addNode(v);

        if(!adjacencyList.get(u).contains(v)) adjacencyList.get(u).add(v);
        if(!adjacencyList.get(v).contains(u)) adjacencyList.get(v).add(u);
    }
    //method to connect particular nodes
    public void addconnection(String u,String v)
    {
        addEdge(u, v);
        //if(!connections.get(u).contains(v)) connections.get(u).add(v);
        //if(!connections.get(v).contains(u)) connections.get(v).add();
    }
     //method to print data
    public void printGraph()
    {
        for(String node :adjacencyList.keySet())
        {
            System.out.println(node+"->"+adjacencyList.get(node));
        }
    }
    //remove edges
    public void removeEdges(String u,String v)
    {
        if(adjacencyList.containsKey(u))
        {
            adjacencyList.get(u).remove(String.valueOf(v));
        }
        if(adjacencyList.containsKey(v))
        {
            adjacencyList.get(v).remove(String.valueOf(u));
        }
    }
    public static void main(String args[])
    {
        Graphs_in_DSA ob=new Graphs_in_DSA();
        ob.addNode("arjun");
        ob.addNode("ram");
        ob.addNode("prabhas");
        ob.addNode("nani");
        ob.removeEdges("arjun", "prabhas");
        ob.removeEdges("nani", "ram");
        ob.removeEdges("prabhas","arjun");
        ob.removeEdges("prabhas","ram" );
        ob.removeEdges("ram","nani");
        ob.printGraph();
        ob.addconnection("ram","nani");
        System.out.println("\n");
        ob.printGraph();
    }
}