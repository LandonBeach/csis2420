// Assignment 4 source code

public class TreeTest
{
  public static void main(String [] args)
  {
    Tree myTree = new Tree(50000);
    int rand;
    long start;
    long end;
    long time;

    //Start the timer
    start = System.currentTimeMillis();

    for (int i = 1; i <=1000; i++) {
      rand = (int)(Math.random()*1000000);
      System.out.println("Inserting " + rand);
      myTree.insertNode(myTree.root,rand);
    }

    System.out.println();
    System.out.println("After doing inOrderTraversal");
    myTree.inOrderTraversalMin(myTree.root);

    //End the timer
    end = System.currentTimeMillis();
    time = end - start;
    System.out.println("\nTime: " + time + " milliseconds");
  }
}
