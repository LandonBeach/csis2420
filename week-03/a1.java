// Assignment 1 source code

import java.math.*;

public class ListTestSize
{
  public static void main (String [] args)
  {
    String lastName = "Beach";
    String firstName = "Landon";
    String major = "Computer Science";
    String className = "CSIS 2420";
    List list = new List();
    boolean notEmpty = true;

    list.insertAtFront(lastName);
    list.insertAtBack(firstName);
    list.insertAtBack(major);
    list.insertAtBack(className);

    System.out.println(list.print());
    System.out.println("Size of the list is " + list.size());

    while (notEmpty
    {
      System.out.println("Removed " + list.removeFromFront() + " from the list");
      System.out.println(list.print());
      System.out.println("Size of the list is " + list.size());
      if (list.isEmpty())
      {
        notEmpty = false;
      }
    }
  }
}


//Simple List class
public class List
{
  private Node firstNode;
  private Node lastNode;
  private String name;

  public List()
  {
    name = "Default List";
    firstNode = lastNode = null;
  }

  public List (String s)
  {
    name = s;
    firstNode = lastNode = null; //Java will read from right to left
  }

  public boolean isEmpty()
  {
    return (firstNode == null);
  }

  public String print()
  {
    String result = "";
    String newline = "\n";

    if (isEmpty())
    {
      return (result += name + " is empty!" + newline);
    }

    result += name + " contains: " + newline;
    Node current = firstNode;

    while (current != null)
    {
      result += current.getObject() + newline;
      current = current.getNext();
    }

    return result;
  }

  public void insertAtFront(Object insertItem)
  {
    if (isEmpty())
    {
      firstNode = lastNode = new Node(insertItem);
    }
    else
    {
      firstNode = new Node(insertItem, firstNode);
    }
  }

  public Object removeFromFront()
  {
    Object removeItem = null;

    if (isEmpty())         // What if the List is empty?
    {
      removeItem = "This list is empty!";
      return removeItem;
    }

    removeItem = firstNode.getObject();

    if (firstNode.equals(lastNode)) // What if it has only 1 node?
    {
      firstNode = lastNode = null;
    }
    else // The List has 2 or more
    {
      firstNode = firstNode.getNext();
    }

    return removeItem;
  }

  public void insertAtBack(Object insertItem)
  {
    if (isEmpty())
    {
      firstNode = lastNode = new Node(insertItem);
    }
    else
    {
      Node temp = new Node(insertItem);
      lastNode.setNext(temp);
      lastNode = temp;
    }
  }

  public Object removeFromBack()
  {
    Object removeItem = null;

    if (isEmpty()) // What if the List is empty?
    {
      removeItem = "This list is empty!";
      return removeItem;
    }

    removeItem = lastNode.getObject();

    if (firstNode.equals(lastNode)) // What if it has only 1 node?
    {
      firstNode = lastNode = null;
    }
    else // The List has 2 or more
    {
      Node current = firstNode;

      while (current.getNext() != lastNode)
      {
        current = current.getNext();
      }

      current.setNext(null);
      lastNode = current;
    }

    return removeItem;
  }

  public int size()
  {
    if (isEmpty())
    {
      return 0;
    }
    else
    {
      int listSize = 1;
      Node current = firstNode;

      while (current.getNext() != null)
      {
        current = current.getNext();
        listSize++;
      }
      return listSize;
    }
  }
}
