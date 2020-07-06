package algorithms.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 树木的前中后遍历
 */
public class TreeOrder {
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }
    public static void afterOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        afterOrder(root.left);
        afterOrder(root.right);
        System.out.print(root.val);
    }



    public static void main(String[] args) {
        /**
         *       1
         *   2        3
         * 4   5    6
         */
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4,null,null),new TreeNode(5,null,null)),new TreeNode(3,new TreeNode(6,null,null),null));
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        afterOrder(root);

        System.out.println(prerderTraversal(root));
    }


    public static List<Integer> prerderTraversal(TreeNode root) {
        return divideAndConquer(root);
    }

    public static List<Integer> divideAndConquer(TreeNode node) {
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
}
