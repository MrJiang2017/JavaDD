package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * 示例:
 * s = "abaccdeff"
 * 返回 "b"
 * s = ""
 * 返回 " "
 * 限制：
 * 0 <= s 的长度 <= 50000
 * @author
 */
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for (char c:sc){
            map.put(c,!map.containsKey(c));
        }
        for (char c:sc){
            if (map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
