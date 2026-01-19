package AdjacenyList;

import java.util.ArrayList;


public class Graph 
{
    ArrayList<LinkedList<Node>> alist;

    Graph()
    {
        alist = new ArrayList<>();
    }

    public void addNode(Node node)
    {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst)
    {
        
    }

    public void checkEdge(int src, int dst)
    {
        
    }

    public void print()
    {

    }
}
