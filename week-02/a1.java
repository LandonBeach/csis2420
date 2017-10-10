//  Assignment 1 source code

import java.math.*;
public class NodeTest
{
  public static void main(String args [])
  {
    Node lastName = new Node("Last Name");
    Node firstName = new Node("First Name");
    Node major = new Node("Major");
    Node className = new Node("Class");

    // Set nodes and print entire contents
    lastName.setNext(firstName);
    firstName.setNext(major);
    major.setNext(className);
    printContents(lastName);
  }

  public static void printContents(Node list)
  {
    if (list.getNext() != null)
    {
      System.out.println(list.getObject());
      printContents(list.getNext());
      return;
    }
    else
    {
      System.out.println(list.getObject() + "\n");
      return;
    }
  }
}
