// Assignment 2 source code

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

    // Add and set two Nodes and print entire contents
    Character ch = new Character('$');
    BigInteger big = new BigInteger("1237890987521");
    Node bigIntegerNode = new Node(big, lastName);
    Node characterNode = new Node(ch, bigIntegerNode);
    printContents(characterNode);
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
