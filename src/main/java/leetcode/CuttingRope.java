package leetcode;

/**
 * 剪绳子
 *
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 示例 1：
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 * 提示：
 *
 * 2 <= n <= 58
 * @author user
 */
public class CuttingRope {

    public static int res(int num){

        if (2==num){
            return 1;
        }
        if (3==num){
            return 2;
        }
        /**
         * 取包含3的个数
         */
        int a = num/3;
        /**
         * 取余
         */
        int b = num%3;
        /**
         * 余0的时候，可以被3整除，每一段剪成3，相乘最大
         */
        if (b==0){
            return (int)Math.pow(3,a);
        }
        /**
         * 余1，应拆一个3，合成一个4
         */
        if (b==1){
            return (int)Math.pow(3,a-1)*4;
        }
        /**
         * 余2，乘以2
         */
        return (int)Math.pow(3,a)*2;
    }

    public static void main(String[] args) {
        System.out.println(res(11));
    }
}
