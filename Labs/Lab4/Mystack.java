package Labs.Lab4;

public class Mystack {
    char[] stack;
    int top=0;
    Mystack(int size)
    {
        stack= new char[size];
    }

    void push(char a)
    {
        stack[++top] = a;
    }
   public void pop()
    {
        if (top == -1)
        {
            System.out.println ("expression is invalid");
            System.exit (0);
        }
        else
        {
            top--;
        }
    }
    void find_top()
    {
        if (top == -1)
            System.out.println ("expression is valid");
        else
            System.out.println ("expression is invalid");
    }
    void valid(String str)
    {
        top=-1;
        int i;
        for (i = 0;i < str.length ();i++)
        {
            if (str.charAt (i) == '(')
            {
                push(str.charAt (i));
            }
            else if (str.charAt (i) == ')')
            {
                pop();
            }
        }
        find_top();
    }
}
