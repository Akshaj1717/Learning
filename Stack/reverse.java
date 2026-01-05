package Stack;
import java.util.Stack;

public class reverse 
{
    public static void main(String[] args) 
    {
        reverse p = new reverse();
        p.reverse("abcd");
    }

    public void reverse(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++ )
        {
            stack.push(str.charAt(i));
        }
        StringBuilder reversedStr = new StringBuilder();
        while(!stack.isEmpty())
        {
            reversedStr.append(stack.pop());
        }
        System.out.println(reversedStr.toString());
    }
}
