package AdjacenyList;

import java.util.ArrayList;
import java.util.*;

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
