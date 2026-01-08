package Queues;

class Node 
{
    int data;
    Node next;
    Node(int new_data) 
    {
        data = new_data;
        next = null;
    }
}

public class linkedListImpl 
{
    private Node front;
    private Node rear;

    public linkedListImpl()
    {
        front = null;
        rear = null;
    }

    public void enqueue(int newData)
    {
        Node newNode = new Node(newData);
        if (front == null && rear == null)
        {
            front = rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
        
    }

    public void dequeue()
    {
        if (front == null)
        {
            System.out.println("Queue is empty");
        }

        Node temp = front;
        front = front.next;
        if (front == null)
        {
            rear = null;
        }
        temp = null;
    }

    public boolean isEmpty()
    {
        if (front == null)
        {
            return true;
        }

        return false;
    }

    public int front()
    {
        if (front == null)
        {
            System.out.println("Queue is empty");
        }

        return front.data;
    }
}
