// Assignment 1 source code

import java.io.*;
import java.util.*;

public class IntList
{
  public static void main (String[] args) throws IOException
  {
    Integer[] randomNumbers = new Integer[15];

    for (int i=0; i < 15; i++)
    {
      randomNumbers[i] = (int)Math.floor(Math.random()*100);
    }

    randomNumbers[0] = 50;
    List<Integer> intList = Arrays.asList(randomNumbers);
    System.out.println("The intList contains:");

    for (int s : intList)
    {
      System.out.println(s);
    }

    System.out.println("\n");
    System.out.print("Is the intList empty? ");

    if (intList.isEmpty())
    {
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }

    System.out.print("Does it contain 50? ");

    if (intList.contains(50))
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
    
    int removedInt = randomNumbers[0];
    intList.remove("50");
    System.out.println("Removed " + removedInt + " from the intList");
  }
}
