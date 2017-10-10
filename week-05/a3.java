// Assignment 4 source code
// Test driver for strings in a Tree

public class TreeStringTestSUU
{
  public static void main (String [] args)
  {
    String aboutSUU = "From its founding in 1897, Southern Utah University has evolved from a teacher training institution to now becoming Utah's designated";
    String [] words = aboutSUU.split(" ");
    TreeString myTree = new TreeString("About SUU");

    System.out.println("The first 20 words on the About SUU webpage: ");
    System.out.println(aboutSUU + '\n');

    for (int i = 0; i < words.length; i++)
    {
      System.out.println("Inserting " + words[i]);
      myTree.insertNode(myTree.root, words[i]);
    }

    System.out.println();
    System.out.println("After doing inOrderTraversal A-Z:");
    myTree.inOrderTraversalMin(myTree.root);
    System.out.println('\n');

    System.out.println("After doing inOrderTraversal Z-A:");
    myTree.inOrderTraversalMax(myTree.root);
    System.out.println();
  }
}

// Tree class for dealing with Strings
public class TreeString
{
  public TreeNodeString root;
  private String minimum;
  private String maximum;

  public TreeString (String key)
  {
    root = new TreeNodeString(key);
  }

  public void insertNode (TreeNodeString node, String data)
  {
    if (data.compareTo(node.getKey()) < 0)
    {
      if (node.getLeft() == null)
      {
        node.setLeft(new TreeNodeString(data));
      }
      else
      {
        insertNode(node.getLeft(), data);
      }
    }

    else if (data.compareTo(node.getKey()) > 0)
    {
      if (node.getRight() == null)
      {
        node.setRight(new TreeNodeString(data));
      }
      else
      {
        insertNode(node.getRight(), data);
      }
    }
  }

  public void inOrderTraversalMin (TreeNodeString node)
  {
    if (node == null)
    {
      return;
    } //grounding condition

    inOrderTraversalMin(node.getLeft());
    System.out.print(node.getKey() + " ");
    inOrderTraversalMin(node.getRight());
  }

  public void inOrderTraversalMax (TreeNodeString node)
  {
    if (node == null)
    {
      return;
    } //grounding condition

    inOrderTraversalMax(node.getRight());
    System.out.print(node.getKey() + " ");
    inOrderTraversalMax(node.getLeft());
  }

  public String min (TreeNodeString node)
  {
    if (node.getLeft() == null)
    {
      minimum = node.getKey();
      return minimum;
    }

    min(node.getLeft());
    return minimum;
  }

  public String max (TreeNodeString node)
  {
    if (node.getRight() == null)
    {
      maximum = node.getKey();
      return maximum;
    }

    max(node.getRight());
    return maximum;
  }

  public boolean find (TreeNodeString node, String data)
  {
    if (node == null)
    {
      return false;
    }

    if (data.compareTo(node.getKey()) == 0 )
    {
      return true;
    }

    if (find(node.getLeft(), data))
    {
      return true;
    }

    if (find(node.getRight(),data))
    {
      return true;
    }

    return false;
  }
}
