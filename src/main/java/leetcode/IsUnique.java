package leetcode;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * 示例 1：
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 * 输入: s = "abc"
 * 输出: true
 * 限制：
 * 0 <= len(s) <= 100
 *
 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("aa"));
    }
    public static boolean isUnique(String s){
        int p = 0,m=0;
        for(int i=0;i<s.length();i++){
            int b = s.charAt(i)-'a';
            int c = 1<<b;
            m=1<<s.charAt(i)-'a';
            if((p&m)!=0){
                return false;
            }
            p|=m;
        }
        return true;
    }

}
