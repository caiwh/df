package algorithms.divide;

import algorithms.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 通过分治法前序遍历树
 */
public class TreeTraversalByDivide {

    public static List<Integer> prerderTraversal(TreeNode root) {
        return divideAndConquer(root);
    }

    public static  List<Integer> divideAndConquer(TreeNode node) {
        List<Integer> result = new LinkedList<Integer>();
        if (node == null) {
            return null;
        }
        // 分治
        List<Integer> left = divideAndConquer(node.left);
        List<Integer> right = divideAndConquer(node.right);
        // 合并结果
        result.add(node.val);
        if (left != null) {
            result.addAll(left);
        }
        if (right != null) {
            result.addAll(right);
        }
        return result;
    }
    /**
     *       1
     *   2        3
     * 4   5    6
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4,null,null),new TreeNode(5,null,null)),new TreeNode(3,new TreeNode(6,null,null),null));
        System.out.println(prerderTraversal(root));

    }
}
