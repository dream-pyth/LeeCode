/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 *
 * <p>
 *
 * <p>示例 1：
 *
 * <p>输入：root = [4,2,7,1,3,6,9] 输出：[4,7,2,9,6,3,1]
 *
 * <p>示例 2：
 *
 * <p>输入：root = [2,1,3] 输出：[2,3,1] 示例 3：
 *
 * <p>输入：root = [] 输出：[]
 *
 * <p>提示：
 *
 * <p>树中节点数目范围在 [0, 100] 内 -100 <= Node.val <= 100
 */
public class text226 {
    public static void main(String[] args) {}

    /**
     * 采用递归方法，交换左右节点，返回根节点
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.right = left;
        root.left = right;

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
