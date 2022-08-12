import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * <p>你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * <p>
 *
 * <p>示例 1：
 *
 * <p>输入：nums = [3,2,3] 输出：3
 *
 * <p>示例 2：
 *
 * <p>输入：nums = [2,2,1,1,1,2,2] 输出：2
 *
 * <p>提示： n == nums.length 1 <= n <= 5 * 10^4 -10^9 <= nums[i] <= 10^9
 *
 * <p>进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 */
public class text169 {
    public static void main(String[] args) {
        System.out.println(
                majorityElement(new int[] {3, 4, 3, 2, 2, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.stream()
                .forEach(
                        i -> {
                            if (map.containsKey(i)) {
                                map.put(i, map.get(i) + 1);
                            } else {
                                map.put(i, 1);
                            }
                        });
        System.out.println(map);
        int last = 0;
        int max = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                last = key;
            }
        }
        return last;
    }
}
