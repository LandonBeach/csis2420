// Assignment 2 source code
// Test driver for find() method
public class TreeTestFind
{
  public static void main(String [] args)
  {
    Tree myTree = new Tree(6);

    for (int i = 1; i <=10; i++)
    {
      System.out.println("Inserting " + i);
      myTree.insertNode(myTree.root, i);
    }

    if (myTree.find(myTree.root, 5))
    {
      System.out.println("The number 5 is in the list");
    }
    else
    {
      System.out.println("The number 5 is NOT in the list");
    }

    if (myTree.find(myTree.root,50))
    {
      System.out.println("The number 50 is in the list");
    }
    else
    {
      System.out.println("The number 50 is NOT in the list");
    }
  }
}

// Put code inside the Tree class
public boolean find (TreeNode node, int n)
{
  if (node == null)
  {
    return false;
  }

  if (node.getKey() == n)
  {
    return true;
  }

  if (find(node.getLeft(),n))
  {
    return true;
  }

  if (find(node.getRight(),n))
  {
    return true;
  }

  return false;
}
