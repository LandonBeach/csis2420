// Assignment 3 source code

import java.math.*;

public class ListTestFront
{
  public static void main (String [] args)
  {
    BigInteger big = new BigInteger("1234567890");
    String str = new String("Hello World");
    Character ch = new Character('$');
    Integer in = new Integer("42");
    List lst = new List();
    boolean notEmpty = true;

    lst.insertAtFront(in);
    lst.insertAtFront(ch);
    lst.insertAtFront(str);
    lst.insertAtFront(big);

    System.out.println(lst.print());

    while (notEmpty)
    {
      lst.removeFromFront();
      System.out.println(lst.print());
      if (lst.isEmpty())
      {
        notEmpty = false;
      }
    }
  }
}
