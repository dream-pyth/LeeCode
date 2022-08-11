import java.util.Arrays;

/**
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 *
 * <p>示例 1：
 *
 * <p>输入：n = 2 输出：[0,1,1] 解释： 0 --> 0 1 --> 1 2 --> 10
 *
 * <p>示例 2：
 *
 * <p>输入：n = 5 输出：[0,1,1,2,1,2] 解释： 0 --> 0 1 --> 1 2 --> 10 3 --> 11 4 --> 100 5 --> 101
 *
 * <p>提示：
 *
 * <p>0 <= n <= 10^5
 */
public class text338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(85723)));
    }

    /**
     * 找规律，n%2 若为0 ，则n与n/2的1的个数相同， 若为1， 则为 n/2 的个数+1
     *
     * @param n
     * @return
     */
    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n / 2; i++) {
            res[i * 2] = res[i];
            if (i * 2 + 1 <= n) {
                res[i * 2 + 1] = res[i] + 1;
            }
        }
        return res;
    }

    //    /**
    //     * 思路： 5的值为4的值加上一个数组:5的二进制数（超出内存）
    //     *
    //     * @param n
    //     * @return
    //     */
    //    public static int[] countBits(int n) {
    //        if (n == 0) {
    //            return new int[] {0};
    //        }
    //        // 计算n的二进制位数
    //        int[] res = new int[n + 1];
    //        int[] re = countBits(n - 1);
    //        for (int i = 0; i < n; i++) {
    //            res[i] = re[i];
    //        }
    //        res[n] = toBinary(n);
    //        return res;
    //    }
    //
    //    /**
    //     * 计算n的二级制数
    //     *
    //     * @param n
    //     */
    //    private static int toBinary(int n) {
    //        if (n == 0) {
    //            return 0;
    //        }
    //        if (n == 1) {
    //            return 1;
    //        }
    //        if (n % 2 == 1) {
    //            return toBinary(n / 2) + 1;
    //        } else {
    //            return toBinary(n / 2);
    //        }
    //    }
}
