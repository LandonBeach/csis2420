// Assignment 1 source code
// Test driver for max() and min() in the Tree Class

public class TreeTestMaxAndMin
{
  public static void main(String [] args)
  {
    Tree myTree = new Tree(50);
    int rand;

    for (int i = 1; i <=10; i++)
    {
      rand = (int)(Math.random()*100);
      System.out.println("Inserting " + rand);
      myTree.insertNode(myTree.root,rand);
    }

    System.out.println();
    System.out.println("The max number is " + myTree.max(myTree.root));
    System.out.println("The min number is " + myTree.min(myTree.root));
  }
}

// Put this code inside of the Tree class
public int min (TreeNode node)
{
  if (node.getLeft() == null)
  {
    minimum = node.getKey();
    return minimum;
  }

  min(node.getLeft());
  return minimum;
}

public int max (TreeNode node)
{
  if (node.getRight() == null)
  {
    maximum = node.getKey();
    return maximum;
  }

  max(node.getRight());
  return maximum;
}
