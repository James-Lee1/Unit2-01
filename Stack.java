/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program creates a stack and pushes three numbers to it
 *
 ****************************************************************************/

import java.util.ArrayList;

class Stack {

    private final ArrayList<Integer> myStack = new ArrayList<Integer>();

    // Adds integers onto the stack
    public void push(int number)
    {
        myStack.add(number);
    }

    // Prints out the whole stack
    public String toString()
    {
        String output = "";

        for (Integer count : myStack)
        {
            output += count + "\n";
        }

        return output.toString();
    }

}
