/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * <p>请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * <p>示例 1:
 *
 * <p>输入: nums = [0,1,0,3,12] 输出: [1,3,12,0,0] 示例 2:
 *
 * <p>输入: nums = [0] 输出: [0]
 *
 * <p>提示:
 *
 * <p>1 <= nums.length <= 10^4
 *
 * <p>-2^31 <= nums[i] <= 2^31 - 1
 */
public class text283 {
    public static void main(String[] args) {
        moveZeroes(new int[] {0, 1, 3, 1, 4, 0, 5, 7, 0, 9});
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 0) {
                int j = i + 1;
                // j 需要小于 length-1, 当倒数第二个仍然为0时, j = 最后一个
                while (j < nums.length - 1 && nums[j] == 0) {
                    j++;
                }
                // 与后一项不为0的进行交换
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}
