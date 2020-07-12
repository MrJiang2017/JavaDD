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
        int[] order = new int[matrix.length*matrix[0].length];
        /**
         * 头
         */
        int top =0;
        /**
         * 左
         */
        int left=0;
        /**
         * 右
         */
        int right=matrix[0].length-1;
        /**
         * 尾
         */
        int tail=0;
        int count=0;
        for (int i=0;i<matrix[0].length-1;i++){
            /**
             * 左到右
             */
            for (int j=0;j<matrix[top].length-1;j++){
                order[count]= matrix[top][left];
                count++;
                left++;
            }
            /**
             * 上到下
             */
            for (int j=0;j<matrix.length;j++){
                order[count]= matrix[left][tail];
                count++;
                tail++;
            }

            /**
             * 右到左
             */
            for (int j=0;j<matrix[0].length-1;j++){
                order[count]= matrix[tail][right];
                count++;
                right--;
            }
            /**
             * 下到上
             */
            for (int j=0;j<matrix[0].length-1;j++){
                order[count]= matrix[left][tail];
                count++;
                left--;
            }
        }
        return order;
    }
}
