package Queues;

public class circularQueue 
{
    private int[] arr;
    private int capacity;
    private int front;
    private int size;

    public circularQueue(int cap)
    {
        capacity = cap;
        arr = new int[capacity];
        front = 0;
        size = 0;
    }

    public void enqueue(int x)
    {
        if (size == capacity)
        {
            System.out.println("Queue is full");
        }

        int rear = (front + size) % capacity;
        arr[rear] = x;
        size++;       
    }

    public void dequeue()
    {
        if (size == 0)
        {
            System.out.println("Queue is empty");
        }

        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(value);
    }

    public int getRear()
    {
        if (size == 0)
        {
            System.out.println("Queue is empty");
        }

        int rearVal = (front + size - 1) % capacity;
        return arr[rearVal];
    }

    public int getFront()
    {
        if (size == 0)
        {
            System.out.println("Queue is empty");
        }

        int frontVal = arr[front];
        return frontVal;
    }

    public static void main(String[] args) 
    {
        circularQueue q = new circularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.getFront() + " " + q.getRear());
        q.dequeue();
        System.out.println(q.getFront() + " " + q.getRear());
        q.enqueue(40);
        System.out.println(q.getFront() + " " + q.getRear());
    }
}
