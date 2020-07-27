package leetcode;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 *
 */
public class CheckPermutation {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int sum1=0,sum2=0;
        for(int i=0;i<s1.length();i++){
            sum1+=s1.charAt(i);
            sum2+=s2.charAt(i);
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
}
