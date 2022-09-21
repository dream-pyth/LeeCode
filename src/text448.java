import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 *
 * <p>
 *
 * <p>示例 1：
 *
 * <p>输入：nums = [4,3,2,7,8,2,3,1] 输出：[5,6]
 *
 * <p>示例 2：
 *
 * <p>输入：nums = [1,1] 输出：[2]
 *
 * <p>提示：
 *
 * <p>n == nums.length 1 <= n <= 10^5 1 <= nums[i] <= n
 *
 * <p>进阶：你能在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题吗? 你可以假定返回的数组不算在额外空间内。
 */
public class text448 {

    /**
     * 思路：将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字。
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            // 变为负数
            nums[Math.abs(num) - 1] = -1 * Math.abs(nums[Math.abs(num) - 1]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
