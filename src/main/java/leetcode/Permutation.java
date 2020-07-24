package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * 示例:
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 * 限制：
 * 1 <= s 的长度 <= 8
 * @author
 */
public class Permutation {
    List<String> list = new ArrayList<>();
    char[] c;
    public String[] permutation(String s) {
        if (null==s){
            return new String[0];
        }
        dfs(0);
        return list.toArray(new String[list.size()]);

    }
    public void dfs(int x){
        if (x==c.length-1){
            list.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i=x;i<c.length;i++){
            if (set.contains(c[i])){
                continue;
            }
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }
    public void swap(int i,int x){
        char tmp = c[x];
        c[x] = c[i];
        c[i] = tmp;
    }
}
