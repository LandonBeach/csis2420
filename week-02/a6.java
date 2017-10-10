// Assignement 6 source code

import java.math.*;

public class ListTestLoop {
  public static void main (String [] args)
  {
    BigInteger big = new BigInteger("1234567890");
    String str = new String("Hello World");
    Character ch = new Character('$');
    Integer in = new Integer("42");
    List lst = new List();

    lst.insertAtFront(in);
    lst.insertAtFront(ch);
    lst.insertAtFront(str);
    lst.insertAtFront(big);

    System.out.println(lst.printLoop());
  }
}
