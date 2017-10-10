// Assignment 2 source code

import java.io.*;
import java.util.*;

public class priorityQueue
{
  public static void main (String[] args) throws IOException
  {
    String[] wordArray = utilities.fileToStringArray(args[0]);
    List<String> wordList = Arrays.asList(wordArray);
    Queue<String> queue = new PriorityQueue<String>(wordList);

    System.out.println("Size of the Priority Queue: " + queue.size());
    System.out.println("Peek at the first element: " + queue.peek());

    System.out.print("Does it contain \"Landon\"? ");
    if (queue.contains("Landon"))
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }


    System.out.print("Clearing all the elements... ");
    queue.clear();
    System.out.println("Done!");

    System.out.println("Size of the Priority Queue: " + queue.size());

    String addString = "Landon";
    System.out.println("Adding the string \"" + addString + "\"");
    queue.add(addString);

    addString = "Beach";
    System.out.println("Adding the string \"" + addString + "\"");
    queue.add(addString);

    addString = "I'm awesome!";
    System.out.println("Adding the string \"" + addString + "\"");
    queue.add(addString);

    addString = "Now is the time for geeks to inherit the earth";
    System.out.println("Adding the string \"" + addString + "\"");
    queue.add(addString);

    addString = "I'm not awesome!";
    System.out.println("Adding the string \"" + addString + "\"");
    queue.add(addString);

    System.out.println("Size of the Priority Queue: " + queue.size());

    System.out.print("Does it contain \"" + addString + "\"? ");
    if (queue.contains(addString))
    {
      System.out.println("Yes");
      queue.remove(addString);
      System.out.println("Removed \"" + addString + "\"");
    }
    else
    {
      System.out.println("No");
    }

    System.out.println("\nPriority Queue contains:");
    while (!queue.isEmpty())
    {
      System.out.println(queue.poll());
    }

    System.out.println("\n");
  }
}
