// Assignment 3 source code

import java.io.*;
import java.util.*;

public class set06
{
  public static void main (String[] args) throws IOException
  {
    String[] wordArray = utilities.fileToStringArray(args[0]);
    List<String> wordList = Arrays.asList(wordArray);
    TreeSet<String> setA = new TreeSet<String>(wordList);
    TreeSet<String> setB = new TreeSet<String>(wordList);
    TreeSet<String> setC;
    Iterator<String> it;

    it = setA.iterator();

    while (it.hasNext())
    {
      if (cond(it.next()))
      {
        it.remove();
      }
    }

    it = setB.iterator();

    while (it.hasNext())
    {
      if (cond2(it.next()))
      {
        it.remove();
      }
    }

    setC = union(setA, setB);
    System.out.println("setA union setB contains " + setC.size() + " elements");

    setC = intersect(setA, setB);
    System.out.println("setA intersect setB contains " + setC.size() + " elements");

    setC = difference(setA, setB);
    System.out.println("setA difference setB contains " + setC.size() + " elements");
  }

  public static boolean cond (String str)
  {
    return (str.length() <= 5);
  }

  public static boolean cond2 (String str)
  {
    return (str.length() >= 6);
  }

  public static TreeSet<String> union (TreeSet<String> A, TreeSet<String> B)
  {
    TreeSet<String> setCopy = new TreeSet<String>();
    setCopy.addAll(A);
    setCopy.addAll(B);
    return setCopy;
  }

  public static TreeSet<String> intersect (TreeSet<String> A, TreeSet<String> B)
  {
    TreeSet<String> setCopy = new TreeSet<String>();
    Iterator<String> it;

    if (A.size() >= B.size())
    {
      it = A.iterator();
      while (it.hasNext())
      {
        if (B.contains(it.next()))
        {
          setCopy.add(it.next());
        }
      }
    }
    else
    {
      it = B.iterator();
      while (it.hasNext())
      {
        if (A.contains(it.next()))
        {
          setCopy.add(it.next());
        }
      }
    }

    return setCopy;
  }

  public static TreeSet<String> difference (TreeSet<String> A, TreeSet<String> B)
  {
    TreeSet<String> setCopy = union(A, B);
    Iterator<String> it;

    it = B.iterator();

    while (it.hasNext())
    {
      setCopy.remove(it.next());
    }

    return setCopy;
  }
}
