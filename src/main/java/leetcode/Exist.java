package leetcode;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，
 * 在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 * 示例 1：
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 * 示例 2：
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 * 提示：
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 * @author
 */
public class Exist {

    char[][] board;
    boolean[][] v;
    char[] cw;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.cw= word.toCharArray();
        this.v = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                v[i][j]=false;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==cw[0]){
                    if(DFS(i,j,1)){
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public boolean DFS(int x,int y,int i){
        v[x][y] = true;
        if(i==cw.length){
            return true;
        }
        //左移
        if(y>0 && v[x][y-1]==false && board[x][y-1]==cw[i]){
            if(DFS(x,y-1,i+1)){
                return true;
            }
        }
        //右移
        if(y<board[0].length-1 && v[x][y+1]==false && board[x][y+1]==cw[i]){
            if(DFS(x,y+1,i+1)){
                return true;
            }
        }
        //上移
        if(x>0 && v[x-1][y]==false && board[x-1][y]==cw[i]){
            if(DFS(x-1,y,i+1)){
                return true;
            }
        }
        //下移
        if(x< board.length-1 && v[x+1][y]==false && board[x+1][y]==cw[i]){
            if(DFS(x+1,y,i+1)){
                return true;
            }
        }
        v[x][y] = false;
        return false;
    }
}
