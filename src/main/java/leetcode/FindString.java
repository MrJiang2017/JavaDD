package leetcode;

/**
 * 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 * 示例1:
 *  输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 *  输出：-1
 *  说明: 不存在返回-1。
 * 示例2:
 *  输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
 *  输出：4
 *
 */
public class FindString {
    public int findString(String[] words, String s) {
        int i= 0,j=words.length-1;
        boolean flag = true;
        while(i<j){
            int m = (i+j)/2;
            if("".equals(words[i])){
                i++;
                continue;
            }
            if("".equals(words[j])){
                j--;
                continue;
            }
            while("".equals(words[m])){
                m=flag?m+1:m-1;
            }
            if(words[m].compareTo(s)<0){
                i=m+1;
                flag = true;
            }else if(words[m].compareTo(s)>0){
                j=m;
                flag =false;
            }else{
                return m;
            }
        }
        return s.equals(words[i])?i:-1;
    }
}
