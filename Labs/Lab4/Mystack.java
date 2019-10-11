package Labs.Lab4;

import java.util.Arrays;

public class Mystack {
    char[] stack;    // our parantheses will be stored in a char stack
    int top=0;       // remember the indice where the last item is in the array
    Mystack(int size)
    {
        stack= new char[size];   // creating an array of chars
    }

    void push(char a)
    {
        stack[++top] = a;    // it is
    }
   public int  pop()
    {
        if (top == -1)   // to avoid some special cases     )( ,   (())()       as valid
        {
            return 0; // expresion is invalid
        }
        else
        {
            stack[top--]=0;     // char null has value 0 so we clear the slot and then top value decrease by 1
        }
        return 1; //didnt found any special cases
    }
    void find_top()   // this function is called to see if evey parentheses has a pair
    {
        if (top == -1)     //  -1 shows that it is empty
            System.out.println ("expression is valid");
        else
            System.out.println ("expression is invalid");
    }
    void valid(String str)
    {
        top=-1; // stack starts as empty
        int i;
        for (i = 0;i < str.length ();i++) // going through string
        {
            if (str.charAt (i) == '(')   // when finds an '(' adds it in the stack
            {
                push(str.charAt (i));   // push in the stack
            }
            else if (str.charAt (i) == ')')
            {
                if (pop()==0) // set the last slot as null and decrese the top value   // 0 means 100% invalid, and prints it
                {
                    System.out.println ("expression is invalid");
                    return; // no need to check and we stop the function
                }

            }
        }
        find_top(); // if there was no negative values for top it will reach this function to check if the stack is empty
    }
}
