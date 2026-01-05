package Stack;
import java.util.Stack;

public class pattern 
{
    public static void main(String[] args) 
    {
        pattern p = new pattern();
        p.pattern("abbaca");
    }

    public void pattern(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(!stack.isEmpty() && ch == stack.peek())
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        System.out.println(stack);
    }
}
