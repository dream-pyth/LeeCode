/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 * <p>
 *
 * <p>示例 : 给定二叉树
 *
 * <p>1
 *
 * <p>/ \
 *
 * <p>2 3
 *
 * <p>/ \ 4 5
 *
 * <p>返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 * <p>
 *
 * <p>注意：两结点之间的路径长度是以它们之间边的数目表示。
 */
public class text543 {

    public static void main(String[] args) {}

    private static int max;
    /**
     * 根据根节点计算左子树的最大深度+右子树的最大深度，将值记录下来
     *
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        max = 1;
        depth(root);

        // 路径长度为结点数-1
        return max - 1;
    }

    /**
     * 计算最大深度(结点数)
     *
     * @param root
     * @return
     */
    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int L = depth(root.left);
        int R = depth(root.right);
        max = Math.max(max, L + R + 1);

        return Math.max(L, R) + 1;
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
