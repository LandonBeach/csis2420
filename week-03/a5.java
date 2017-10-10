// Assignment 5 source code

public class StackTestPeek
{
  public static void main (String [] args)
  {
    Stack stack = new Stack();
    String lastName = "Beach";
    String firstName = "Landon";
    String major = "Computer Science";
    String className = "CSIS 2420";

    stack.push(className);
    stack.push(major);
    stack.push(firstName);
    stack.push(lastName);

    System.out.println("Top item on the stack is " + stack.peek());
  }
}


// Stack class
public class Stack
{
  private List list;

  public Stack ()
  {
    list = new List("Default Stack");
  }

  public Stack (String name)
  {
    list = new List(name);
  }

  public void push (Object obj)
  {
    list.insertAtFront(obj);
  }

  public Object pop ()
  {
    if (isEmpty())
    {
      return null;
    }
    else
    {
      return list.removeFromFront();
    }
  }

  public boolean isEmpty ()
  {
    return list.isEmpty();
  }

  public Object peek ()
  {
    Object obj = list.removeFromFront();
    list.insertAtFront(obj);
    return obj;
  }
}
