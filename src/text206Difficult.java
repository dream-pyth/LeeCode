/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * <p>示例 1：
 *
 * <p>输入：head = [1,2,3,4,5] 输出：[5,4,3,2,1] 示例 2：
 *
 * <p>输入：head = [1,2] 输出：[2,1] 示例 3：
 *
 * <p>输入：head = [] 输出：[]
 *
 * <p>提示：
 *
 * <p>链表中节点的数目范围是 [0, 5000] -5000 <= Node.val <= 5000
 *
 * <p>进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 */
public class text206Difficult {
    public static void main(String[] args) {}

    /**
     * 假设链表为 ∅ -> 1 -> 2 -> 3 ，我们想要把它改成 ∅ <- 1 <- 2 <- 3.
     *
     * <p>在遍历链表时，将当前节点的 next 指针
     * 指针改为指向前一个节点。由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // 头结点
        ListNode prev = null;
        // 指定当前节点
        ListNode current = head;
        while (current != null) {
            // 临时节点，暂存当前节点的下一个节点
            ListNode next = current.next;
            // 当前指针指向前一个指针
            current.next = prev;
            // 前指针后移
            prev = current;
            // 当前指针后移
            current = next;
        }
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
