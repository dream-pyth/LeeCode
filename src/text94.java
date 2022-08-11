import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 *
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：root = [1]
 * 输出：[1]
 *  
 *
 * 提示：
 *
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 *
 */
public class text94 {

    public static void main(String[] args) {

    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        if (root.left != null) {
            List<Integer> rows = inorderTraversal(root.left);
            for (int i = 0; i < rows.size(); i ++){
                arr.add(rows.get(i));
            }
        }
        arr.add(root.val);
        if (root.right != null) {
            List<Integer> rows = inorderTraversal(root.right);
            for (int i = 0; i < rows.size(); i ++){
                arr.add(rows.get(i));
            }
        }

        return arr;

    }

    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
