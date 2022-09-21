/**
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *
 * <p>给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 *
 * <p>
 *
 * <p>示例 1：
 *
 * <p>输入：x = 1, y = 4 输出：2
 *
 * <p>解释： 1 (0 0 0 1) 4 (0 1 0 0) ↑ ↑ 上面的箭头指出了对应二进制位不同的位置。
 *
 * <p>示例 2：
 *
 * <p>输入：x = 3, y = 1 输出：1
 *
 * <p>提示：
 *
 * <p>0 <= x, y <= 2^31 - 1
 */
public class text461 {

    public static void main(String[] args) {
        // ^异运算，相同为0，不同为1
        int i = 1 ^ 4;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        // ^异运算
        int j = x ^ y;
        // 转换成二进制
        String string = Integer.toBinaryString(j);
        char[] chars = string.toCharArray();
        int i = 0;
        // char是基本数据类型，直接用==就可以进行比较
        for (char a : chars) {
            if (a == '1') {
                i++;
            }
        }
        return i;
    }
}
