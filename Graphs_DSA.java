import java.util.*;
class Graphs_DSA
{
    
    private Map<Integer,List<Integer>> adjacencyList;
    
    public Graphs_DSA()
    {
        adjacencyList=new HashMap<>();
    }

    public void addNode(int v)
    {
        adjacencyList.putIfAbsent(v,new ArrayList<>());
        for(int node:adjacencyList.keySet())
         {
             if(node!=v)
             {
                addEdge(node,v);
             }
         }
    }

    public void addEdge(int u,int v)
    {
    
        if(!adjacencyList.containsKey(u)) addNode(u);
        if(!adjacencyList.containsKey(v)) addNode(v);

        if(!adjacencyList.get(u).contains(v)) adjacencyList.get(u).add(v);
        if(!adjacencyList.get(v).contains(u)) adjacencyList.get(v).add(u);
    }
    //method to print data
    public void printGraph()
    {
        for(int node :adjacencyList.keySet())
        {
            System.out.println(node+"->"+adjacencyList.get(node));
        }
    }
    //method to check whether two nodes are connected or not
    public String isconnected(int v,int u)
    {
        if(adjacencyList.containsKey(v) && adjacencyList.get(v).contains(u))
        {
            return "connected";
        }
        return "not connected";
    }
    //method to find number edges in a graph
    public void edgecount()
    {
        int count=0;
        for(int node:adjacencyList.keySet())
        {
            count=count+adjacencyList.get(node).size();
        }
        System.out.println("number of edges in the graph: "+count/2);
    }
    //method to find adjacent edges of a node
    public void countofAdj()
    {
        int count=0;
        for(int v:adjacencyList.keySet())
        {
            count=adjacencyList.get(v).size();
            System.out.println(v+" : "+count);
        }
        return;
    }
    //number of nodes 
    public int nodecount()
    {
        int count=0;
        for(int node:adjacencyList.keySet())
        {
            count++;
        }
        return count;
    }
    //method to delete connection
    public void deleteconnection(int u,int v)
    {
        if(adjacencyList.containsKey(u))
        {
            adjacencyList.get(u).remove(Integer.valueOf(v));
        }
        if(adjacencyList.containsKey(v))
        {
            adjacencyList.get(v).remove(Integer.valueOf(u));
        }
    }
    //method to find adjacent number of edges to a node
    public int adjacentEdges(int nodevalue)
    {
        if(adjacencyList.containsKey(nodevalue))
        {
           return adjacencyList.get(nodevalue).size();
        }
        else
        {
            System.out.println("node value not found");
            return 0;
        }
    }
    //
    public static void main(String args[])
    {
        Graphs_DSA ob=new Graphs_DSA();
        ob.addNode(6);
        ob.addNode(1);
        ob.addNode(1);
        ob.addNode(3);
        ob.addNode(8);
        ob.addNode(4);
        ob.addNode(6);
        ob.addNode(8);
        ob.addNode(4);

        ob.printGraph();
        System.out.println("the nodes are connected or not: "+ob.isconnected(8, 3));
        ob.deleteconnection(8,3);
        ob.printGraph();
        ob.edgecount();
        System.out.println("count of nodes : "+ob.nodecount());
        System.out.println("count of adjacent edges of each node: "+ob.adjacentEdges(6));
        ob.countofAdj();
    }
}

