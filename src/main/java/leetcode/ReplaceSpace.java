package leetcode;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 10000
 * @author
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder ss = new StringBuilder();
        for (char c:s.toCharArray()){
            if (c==' '){
                ss.append("%20");
            }else {
                ss.append(c);
            }
        }
        return ss.toString();
    }
}
