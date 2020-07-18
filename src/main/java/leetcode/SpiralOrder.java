package leetcode;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 *
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * @author
 */
public class SpiralOrder {
    /**
     * 按层次来，左右，上下，右左，下上
     * 1，2，3，
     * 4，5，6，
     * 7，8，9
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new int[0];
        }
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while(true) {
            for(int i = l; i <= r; i++){
                /**
                 *   left to right.
                 */
                res[x++] = matrix[t][i];
                if(++t > b){
                    break;
                }
            }
            for(int i = t; i <= b; i++){
                /**
                 *   top to bottom.
                 */
                res[x++] = matrix[i][r];
                if(l > --r){
                    break;
                }
            }
            for(int i = r; i >= l; i--){
                /**
                 *  right to left.
                 */
                res[x++] = matrix[b][i];
                if(t > --b){
                    break;
                }
            }
            for(int i = b; i >= t; i--){
                /**
                 *  bottom to top.
                 */
                res[x++] = matrix[i][l];
                if(++l > r) {
                    break;
                }
            }
        }
    }
}
