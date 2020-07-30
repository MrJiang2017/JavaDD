package leetcode;

/**
 * 编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。
 *
 * 示例：
 *
 * 输入： a = 1, b = 2
 * 输出： 2
 */
public class Maximum {
    public int maximum(int a, int b) {
        int x = a/2-b/2;
        int d = x>>31;
        return (1+d)*a-d*b;
    }
}
