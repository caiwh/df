
 分治法伪代码
 ```
public class Demo {
    public ResultType traversal(TreeNode root) {
        if (root == null) {
             do something and return
        }

         Divide
        ResultType left = traversal(root.left);
        ResultType right = traversal(root.right);

         Conquer
        ResultType result = Merge from left and right

        return result;
    }
}
```