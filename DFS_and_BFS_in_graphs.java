import java.util.*;
public class DFS_and_BFS_in_graphs {
    private Map<Integer,List<Integer>> adjacencyList=new HashMap<>();
    public void addnode(int data)
    {
        //add node only if absent
        adjacencyList.putIfAbsent(data,new ArrayList<>());
    }
    public void addedges(int u,int v)
    {   
       
        adjacencyList.get(v).add(u);
        adjacencyList.get(u).add(v);

    }
    //bfs method
    public void BFS(int data)
    {
        //to manage repetitions or dupliactes
        Queue<Integer> queue=new java.util.LinkedList<>();
        //does not aloow duplicates
        Set<Integer> visited=new HashSet<>();

        queue.add(data);
        visited.add(data);
        System.out.println("BFS:");
        while(!queue.isEmpty())
        {
            int current=queue.poll();
            System.out.print(current+" ");

            for(int neighbour: adjacencyList.get(current))
            {
                if(!visited.contains(neighbour))
                {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        System.out.println();
    }
    public void printGraph()
    {
        for(int node :adjacencyList.keySet())
        {
            System.out.println(node+"->"+adjacencyList.get(node));
        }
    }

    //DFS method
    public void DFS(int data)
    {
        Set<Integer> visited=new HashSet<>();
        DFSHelper(data,visited);
        
    }
    private void DFSHelper(int node , Set<Integer> visited)
    {
        visited.add(node);
        System.out.print(node +" ");
        for(int neighbour:adjacencyList.get(node))
        {
            if(!visited.contains(neighbour))
            {
                DFSHelper(neighbour,visited);
            }
        }
    }
    public static void main(String args[])
    {
        DFS_and_BFS_in_graphs ob=new DFS_and_BFS_in_graphs();
         ob.addnode(2);
         ob.addnode(4);
         ob.addnode(3);
         ob.addnode(1);
         ob.addnode(2);
         ob.addnode(4);
         ob.addnode(8);
         ob.addnode(6);
         ob.addnode(1);
         ob.addnode(7);
        ob.addedges(2,4);
        ob.addedges(2,3);
        ob.addedges(4,1);
        ob.addedges(4,2);
        ob.addedges(3,6);
        ob.addedges(3,1);
        ob.addedges(3,7);
        ob.addedges(1,4);
        ob.addedges(1,8);
        ob.addedges(6,6);
        ob.addedges(6,6);

        ob.printGraph();
        System.out.println("DFS:");
        ob.DFS(2);
        System.out.println();
        ob.BFS(2);


    }
    
}
