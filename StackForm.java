/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program uses the class Stack, and pushes three numbers to it
 *
 ****************************************************************************/

public class StackForm
{
    public static void main(String[] args)
    {
        // Instantiates stack
        Stack stack = new Stack();

        // Push 3 numbers
        stack.push(29);
        stack.push(2);
        stack.push(10);
        System.out.println(stack.toString());
    }
}
