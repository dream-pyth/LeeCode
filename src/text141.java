import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 *
 * <p>如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0
 * 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 *
 * <p>如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 *
 * <p>示例 1：
 *
 * <p>输入：head = [3,2,0,-4], pos = 1 输出：true 解释：链表中有一个环，其尾部连接到第二个节点。 示例 2：
 *
 * <p>输入：head = [1,2], pos = 0 输出：true 解释：链表中有一个环，其尾部连接到第一个节点。 示例 3：
 *
 * <p>输入：head = [1], pos = -1 输出：false 解释：链表中没有环。
 *
 * <p>提示：
 *
 * <p>链表中节点的数目范围是 [0, 104] -105 <= Node.val <= 105 pos 为 -1 或者链表中的一个 有效索引 。
 */
public class text141 {
    public static void main(String[] args) {}

    /**
     * 用hashMap存储值(效率很低)
     *
     * <p>另一种：记录两个指针， 一个走一步， 另一个走两步， 如果后面的指针追上第一个指针，则说明有环
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        return wetherRing(head, map, 0);
    }

    public static boolean wetherRing(ListNode head, Map<ListNode, Integer> map, int i) {
        if (head == null) {
            return false;
        }
        if (head != null) {
            // 判断map里是否存在key
            if (map.containsKey(head)) {
                return true;
            }
            // 不存在则加入map
            map.put(head, i++);
        }
        if (head.next != null) {
            head = head.next;
            return wetherRing(head, map, i);
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
