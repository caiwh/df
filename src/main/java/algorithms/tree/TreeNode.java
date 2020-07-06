package algorithms.tree;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;
  TreeNode(int x) { val = x; }

  public TreeNode(int x, TreeNode left, TreeNode right) {
    val = x;
    this.left = left;
    this.right = right;
  }
}