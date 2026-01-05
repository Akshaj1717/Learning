package Stack;
import java.util.Arrays;
public class twoStack 
{
    int[] arr;
    int size;
    int top1, top2;

    public twoStack(int n)
    {
        size = n;
        arr = new int[n];
        top1 = n/2 + 1;
        top2 = n/2;
    }

    void push1(int x)
    {
        if (top1 < size)
        {
            arr[top1++] = x;
        }
        else
        {
            System.out.println("Stack Overflow By element: " + x);

        }
    }
    
    void push2(int x)
    {
        if (top2 >= 0)
        {
            arr[top2--] = x;
        }
        else
        {
            System.out.println("Stack Overflow By element: " + x);
        }
    }

    int pop1()
    {
        if (top1 > (size/2))
        {
            return arr[--top1];
        }
        else
        {
            return -1;
        }
    }

    int pop2()
    {
        if (top2 < (size/2))
        {
            return arr[++top2];
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {
        twoStack ts = new twoStack(5);
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        System.out.print(ts.pop1() + " ");
        System.out.print(ts.pop2() + " ");
        System.out.print(ts.pop2() + " ");
    }
}
