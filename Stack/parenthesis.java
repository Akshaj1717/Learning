package Stack;

import java.util.Stack;

public class parenthesis 
{
    public static void main(String[] args) 
    {
        parenthesis p = new parenthesis();
        p.parentheses("({[})");
    }
    
    public void parentheses(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (stack.isEmpty())
                {
                    System.out.println("false");
                }
                else
                {
                    char top = stack.peek();
                    if((ch == ')'  && top !='(') 
                    || (ch == '}' && top != '{')
                    || (ch == ']' && top != '['))
                    {
                        System.out.println("false");
                    }
                    else
                    {
                        stack.pop();
                    }
                    
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
    
}