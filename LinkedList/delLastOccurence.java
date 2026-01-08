package LinkedList;

class Node 
{
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class delLastOccurence
{
    public static Node delete(Node head, int key)
    {
        if (head == null)
        {
            System.out.println("Empty");
        }

        Node curr = head;
        Node prev = null;
        Node prevLast = null;
        Node last = null;

        while (curr != null)
        {
            if (curr.data == key)
            {
                prevLast = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }

        if (last != null)
        {
            if (prevLast!= null)
            {
                prevLast.next = last. next;
            }
            else
            {
                head = head.next;
            }
        }

        return head;
    }

    static void print(Node curr) 
    {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
      
        // Create a hard-coded linked list:
        // 1 -> 2 -> 2 -> 4 -> 2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);

        int key = 2;
        head = delete(head, key);
        print(head);
    }
}