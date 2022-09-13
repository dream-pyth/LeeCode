import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 * <p>示例 1：
 *
 * <p>输入：head = [1,2,2,1] 输出：true
 *
 * <p>示例 2：
 *
 * <p>输入：head = [1,2] 输出：false
 *
 * <p>提示：
 *
 * <p>链表中节点数目在范围[1, 10^5] 内 0 <= Node.val <= 9
 */
public class text234 {

    public static void main(String[] args) {
        isPalindrome(null);
    }

    public static boolean isPalindrome(ListNode head) {
        // 转换成数组
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }
        return true;
    }

    public class ListNode {
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
