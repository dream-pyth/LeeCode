import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 *
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 *
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 *
 * 树中节点数目在范围 [1, 1000] 内
 * -100 <= Node.val <= 100
 */
public class text101 {
    public static void main(String[] args) {
        System.out.println(isSymmetric(null));;
    }


    public static boolean isSymmetric(TreeNode root) {

        // 递归思想：比较节点的左右节点的值
        if (root == null) {
            return true;
        }
        return compareNode(root.left, root.right);

    }

    private static boolean compareNode(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null) {
            // 如果左右节点都不为空则比较值
            if (left.val != right.val) {
                return false;
            }
            // 将左节点的左节点与右节点的右节点比较 && 将左节点的右节点与右节点的左节点比较
            return compareNode(left.left, right.right) && compareNode(left.right, right.left);
        }
        // 左右节点有一个为空则返回false
        return false;
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
