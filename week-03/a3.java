// Assignment 3 source code
// Code inside List class

public List append (List appendList)
{
  if (appendList.isEmpty())
  {
    return copy();
  }
  else
  {
    List copyList = copy();
    List copyAppendList = appendList.copy();

    while (!copyAppendList.isEmpty())
    {
      copyList.insertAtBack(copyAppendList.removeFromFront());
    }

    return copyList;
  }
}


// Test driver for the append method in the List class
import java.math.*;

public class ListTestAppend
{
  public static void main (String [] args)
  {
    String lastName = "Beach";
    String firstName = "Landon";
    String major = "Computer Science";
    String className = "CSIS 2420";

    BigInteger big = new BigInteger("1234567890");
    String str = new String("Hello World");
    Character ch = new Character('$');
    Integer in = new Integer("42");

    List list = new List("First list");
    List appendList = new List("Second list");

    list.insertAtFront(lastName);
    list.insertAtBack(firstName);
    list.insertAtBack(major);
    list.insertAtBack(className);
    System.out.println(list.print());

    appendList.insertAtFront(big);
    appendList.insertAtBack(str);
    appendList.insertAtBack(ch);
    appendList.insertAtBack(in);
    System.out.println(appendList.print());


    System.out.println(list.append(appendList).print());
  }
}
