/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * <p>说明：
 *
 * <p>你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * <p>示例 1:
 *
 * <p>输入: [2,2,1] 输出: 1 示例 2:
 *
 * <p>输入: [4,1,2,1,2] 输出: 4
 */
public class text136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {4, 1, 2, 1, 2}));
    }

    /**
     * 用异或解法， a^b^a = a^a^b = b
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        if (nums.length > 0) {
            for (int i = 1; i < nums.length; i++) {
                nums[0] ^= nums[i];
            }
        }
        return nums[0];
    }
}
