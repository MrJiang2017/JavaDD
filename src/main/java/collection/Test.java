package collection;

public class Test {
    public static void main(String[] args) {
        int LEN = 10000;
        int[][] arr = new int[LEN][LEN];
        long s = System.currentTimeMillis();
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                arr[i][j] = 1;
            }
        }
        System.out.println("--------"+(System.currentTimeMillis()-s) );
        long ss = System.currentTimeMillis();
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                arr[j][i] = 1;
            }
        }
        System.out.println("#######"+(System.currentTimeMillis()-ss) );
    }
}
