// Assignment 2 source code
// Code inside List class

public List copy()
{
  List listCopy = new List();

  if (isEmpty())
  {
    return listCopy;
  }
  else
  {
    Node current = firstNode;

    while (current.getNext() != null)
    {
      listCopy.insertAtBack(current.getObject());
      current = current.getNext();
    }

    listCopy.insertAtBack(current.getObject());
    return listCopy;
  }
}


// Test driver for the copy() method in the List class

import java.math.*;

public class ListTestCopy
{
  public static void main (String [] args)
  {
    String lastName = "Beach";
    String firstName = "Landon";
    String major = "Computer Science";
    String className = "CSIS 2420";
    List list = new List();
    List copyOfList = new List();

    list.insertAtFront(lastName);
    list.insertAtBack(firstName);
    list.insertAtBack(major);
    list.insertAtBack(className);

    System.out.println(list.print());
    copyOfList = list.copy();
    System.out.println(copyOfList.print());
  }
}
