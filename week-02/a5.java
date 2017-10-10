// Assignment 5 source code

public class ListFillSquares
{
  public static void main (String args [])
  {
    List lst = new List();

    for(int i = 1; i <= 100; i++)
    {
      lst.insertAtBack(i*i);
    }

    System.out.println(lst.print());
  }
}
