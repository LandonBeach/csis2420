// Assignment 2 source code

import java.math.*;

public class TreeNodeTest
{
  public static void main (String[] args)
  {
    int[] num = {1000, 2000, 3000,};

    TreeNode childNode1 = new TreeNode(num[0]);
    TreeNode childNode2 = new TreeNode(num[2]);
    TreeNode root = new TreeNode(num[1], childNode1, childNode2);

    System.out.println(root.getKey());
    System.out.println(root.getLeft().getKey());
    System.out.println(root.getRight().getKey());
  }
}
