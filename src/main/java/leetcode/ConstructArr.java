package leetcode;

/**
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
 * 其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 * 示例:
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 * 提示：
 * 所有元素乘积之和不会溢出 32 位整数
 * a.length <= 100000
 * @author
 */
public class ConstructArr {
    public int[] constructArr(int[] a) {
        if(a.length==0){
            return new int[0];
        }
        int left = 1;
        int[] res = new int[a.length];
        for(int i=0;i<a.length;i++){
            res[i] = left;
            left *= a[i];
        }
        int right = 1;
        for(int i=a.length-1;i>=0;i--){
            res[i] *= right;
            right *= a[i];
        }
        return res;
    }
}
