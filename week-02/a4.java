// Assignment 4 source code

import java.math.*;

public class ListTestBack
{
  public static void main (String [] args)
  {
    String lastName = "Last Name";
    String firstName = "First Name";
    String major = "Major";
    String className = "Class";
    List lst = new List();
    boolean notEmpty = true;

    lst.insertAtBack(lastName);
    lst.insertAtBack(firstName);
    lst.insertAtBack(major);
    lst.insertAtBack(className);

    System.out.println(lst.print());

    while (notEmpty)
    {
      lst.removeFromBack();
      System.out.println(lst.print());

      if (lst.isEmpty())
      {
        notEmpty = false;
      }
    }
  }
}
