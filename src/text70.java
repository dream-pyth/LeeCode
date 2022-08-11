
/**
 * 爬楼梯(第70题)
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 1 <= n <= 45
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @author
 */
public class text70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    public static int climbStairs(int n) {
        /*
            1、n阶台阶，每次爬1或者2，设1的个数为m ,则可以算出2的个数，
            算出m 和n 后进行排列组合（不好算，有精度丢失等问题）
         */

        /*
            2、采用递归的思想：
                爬到第n阶的方法 = 爬到第n-1阶的方法 + 爬到第n-2阶的方法
                因此：采用数组记录爬到每一阶的方法数
                n < 45 ，所以设立数组时大小最大为45
         */

        // 第二种方法直接用递归时间较长：
        /*
            if (n > 2) {
                return climbStairs(n-1) + climbStairs(n-2);
            }
            if (n == 2) {
                return 2;
            }else {
                return 1;
            }
         */

        int[] arr = new int[45];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i-1] = arr[i-2] + arr[i-3];
        }
        return arr[n-1];


    }
}
